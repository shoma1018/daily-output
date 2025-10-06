import {useState} from 'react';
import './App.css';
import SimpleWeatherHeader from './components/SimpleWeatherHeader';
import SearchForm from './components/SearchForm';
import WeatherDisplay from './components/WeatherDisplay';
import type { WeatherDataType } from './types';

type GeocodingData = {
  lat: number,
  lon: number
}

function App() {

  const [city, setCity] = useState("");
  const [weatherData, setWeatherData] = useState<WeatherDataType | null>(null);

  async function searchWeather() {
    try {
      const {lat, lon}: GeocodingData = await fetchGeocoding(city);
      await fetchWeather(lat, lon);
    } catch(error) {
      console.error(error);
      alert('都市名を正しく入力してください。');
    }
  }

  async function fetchGeocoding(city: string) {
    //APIキーを取得
    const API_KEY = import.meta.env.VITE_OPENWEATHERMAP_API_KEY;
    //緯度・経度を取得
    const response = await fetch(`https://api.openweathermap.org/geo/1.0/direct?q=${encodeURIComponent(city)}&limit=1&lang=ja&appid=${API_KEY}`);
    const geocodingData = await response.json();
    if (!geocodingData) {
      throw new Error("入力された都市の緯度経度を取得できませんでした。");
    }
    return { lat: geocodingData[0].lat, lon: geocodingData[0].lon};
  }

  async function fetchWeather(lat: number, lon: number) {
    //APIキーを取得
    const API_KEY = import.meta.env.VITE_OPENWEATHERMAP_API_KEY;
    //天気情報を取得
    const response = await fetch(`https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${API_KEY}`);
    const weatherData = await response.json();
    //エラーハンドリング
    if (!weatherData) {
      throw new Error("入力された都市の天気を取得できませんでした。");
    }
    //天気情報を保存
    setWeatherData(weatherData);
  }

  return (
    <>
      <SimpleWeatherHeader />
      <SearchForm city={city} setCity={setCity} onSearch={searchWeather} />
      <WeatherDisplay weatherData={weatherData}/>
    </>
  )
}

export default App

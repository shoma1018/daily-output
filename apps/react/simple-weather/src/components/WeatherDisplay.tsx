import type { WeatherDataType } from '../types';

type WeatherDisplayProps = {
  weatherData: WeatherDataType | null;
};

function WeatherDisplay({ weatherData }: WeatherDisplayProps) {

  if (!weatherData) {
    return (
      <>
        <p>都市名を入力して、検索してください。</p>
      </>
    )
  }

  const weather = weatherData.weather[0];
  const temp = Math.round(weatherData.main.temp - 273.15);

  return (
    <>
      <div>
        <img src={`https://openweathermap.org/img/wn/${weather.icon}@2x.png`} alt={weather.description} />
      </div>
      <p>{temp}℃</p>
    </>
  )
}

export default WeatherDisplay
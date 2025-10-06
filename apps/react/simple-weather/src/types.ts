// types.ts

// 天気情報の個別データ
export type WeatherType = {
  id: string;
  main: string;
  description: string;
  icon: string;
};

// 天気APIレスポンス型
export type WeatherDataType = {
  name: string;
  main: {
    temp: number;
  };
  weather: WeatherType[];
};
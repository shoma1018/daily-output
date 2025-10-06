# Simple Weather

Reactで作成したシンプルな天気予報アプリです。  
都市名を入力すると、その都市の現在の天気と気温を表示します。  
天気データは [OpenWeatherMap API](https://openweathermap.org/) から取得しています。

---

## 機能一覧

- 天気検索
  - 都市名を入力して検索可能
- 天気表示
  - 天気アイコン、気温を表示
- データ管理
  - APIから取得したデータをステートで保持

---

## 技術スタック
- [React](https://react.dev/)
- [TypeScript](https://www.typescriptlang.org/)
- [Vite](https://vitejs.dev/)（開発環境 / ビルド）
- [OpenWeatherMap API](https://openweathermap.org/api)

---

## 注意事項
- APIキーは `.env` に設定する必要があります
- `.env` は `.gitignore` に含めて GitHub にアップロードしないでください
- OpenWeatherMap の無料プランではリクエスト制限があります
- 現在は1都市の天気のみ取得可能
- Strict Modeは有効にしても問題ありません

---

## 環境構築

### 前提
- Node.js 18 以上
- npm

### セットアップ手順

```bash
# リポジトリをクローン
git clone <リポジトリURL>
cd simple-weather

# 依存関係をインストール
npm install

# .env ファイルを作成しAPIキーを設定
echo "VITE_OPENWEATHERMAP_API_KEY=あなたのAPIキー" > .env

# 開発サーバー起動
npm run dev
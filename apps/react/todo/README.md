# ToDo アプリ

Reactで作成したToDo アプリです。  
タスクを管理でき、一覧表示や追加、編集、削除が可能です。  
データは `localStorage` に保存され、リロードしても保持されます。

## 機能一覧

- タスクの追加
  - 入力フォームからタスクを入力  
- タスクの一覧表示  
  - タスクを表示  
- タスクの削除  
  - タスクを削除可能  
- タスクの編集  
  - 登録済みタスクの内容を変更可能  
- データ永続化  
  - `localStorage` に保存・復元  

## 技術スタック
- [React](https://react.dev/)
- [TypeScript](https://www.typescriptlang.org/)
- [Vite](https://vitejs.dev/)（開発環境 / ビルド）

## Strict Modeについて
このアプリケーションではStrict Modeを有効にしています。
開発モードではStrict ModeによりuseEffectが初回時に2回実行されるため、localStorage への保存処理が複数回走り、
空データで上書きされる場合がありました。
本番ビルドではこの挙動は発生しないので、データは意図通り保持されます。
(Strict Modeを一時的に外して、挙動を確認しています。)


## 環境構築

### 前提
- Node.js 18 以上（v24.5.0 で動作確認済み）
- npm

### セットアップ手順

```bash
# プロジェクト作成
npm create vite@latest todo --template react

# プロジェクトのルートに移動
cd apps/react/todo

# 依存関係インストール
npm install

# 開発サーバー起動
npm run dev
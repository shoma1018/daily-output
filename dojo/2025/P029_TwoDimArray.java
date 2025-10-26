// P029: 2次元配列を作成して、要素を出力する  
public class P029_TwoDimArray {
  public static void main(String[] args) {
    String[] names = {"A", "B", "C"};
    String[] subjects = {"国語", "数学", "英語"};
    int[][] scores = {
      {80, 90, 100},  // Aさん(国語・数学・英語)
      {70, 85, 95},   // Bさん(国語・数学・英語)
      {88, 76, 90}    // Cさん(国語・数学・英語)
    };
    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores[i].length; j++) {
        System.out.println(names[i] + "さんの" + subjects[i] + "の点数は" + scores[i][j] + "です。");
      }
    }
  }
}
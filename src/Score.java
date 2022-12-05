import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Score {

  private int score;

  public Score() {}

  public int playerScore(int playerScore) {
    this.score = playerScore;
    return score;
  }

  public String Str() {
    if (score > 0) {
      return String.valueOf(score);
    } else {
      return "0";
    }
  }

  public void draw(Graphics g) {
    g.setColor(Color.WHITE);
    g.setFont(new Font("Basic", Font.PLAIN, 100));
    g.drawString(Str(), 250, 150);
  }
}

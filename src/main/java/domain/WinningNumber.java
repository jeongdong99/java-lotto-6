package domain;

import java.util.Collections;
import java.util.List;

public class WinningNumber {
    private final List<Integer> winningNumber;
    private final int bonusNumber;
    public WinningNumber(List<Integer> winningNumber, int bonusNumber) {
        this.winningNumber = winningNumber;
        this.bonusNumber = bonusNumber;
        Collections.sort(winningNumber);
    }
    public List<Integer> getWinningNumber() {
        return winningNumber;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }
    public int countMatch(Lotto lotto) {
        int count = 0;
        for(Integer number :lotto.getNumbers()){
            if(winningNumber.contains(number)){
                count++;
            }
        }
        return count;
    }

    public boolean isMatchBonusNumber(Lotto lotto){
      return lotto.getNumbers().contains(bonusNumber);
    }

}

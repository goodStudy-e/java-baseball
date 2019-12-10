package woowa.sw.baseball;

/**
 * strike, ball 데이터 구조(VO)를 가진 class
 * author : sw
 */
public class StrikeBallInfo {
    private int strikeCnt;
    private int ballCnt;

    public StrikeBallInfo(int strikeCnt, int ballCnt) {
        this.strikeCnt = strikeCnt;
        this.ballCnt = ballCnt;
    }

    public int getStrikeCnt() {
        return strikeCnt;
    }

    public void setStrikeCnt(int strikeCnt) {
        this.strikeCnt = strikeCnt;
    }

    public int getBallCnt() {
        return ballCnt;
    }

    public void setBallCnt(int ballCnt) {
        this.ballCnt = ballCnt;
    }
}

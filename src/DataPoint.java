public class DataPoint {
    public int heartBeat;
    public int upperBPNumber;
    public int lowerBPNumber;
    public String musicGenre;

    public DataPoint(int heartBeat, int upperBPNumber, int lowerBPNumber, String musicGenre) {
        this.heartBeat = heartBeat;
        this.upperBPNumber = upperBPNumber;
        this.lowerBPNumber = lowerBPNumber;
        this.musicGenre = musicGenre;
    }

    //==================================================================================================================

    //region Gets and Sets
    public int getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(int heartBeat) {
        this.heartBeat = heartBeat;
    }

    public int getUpperBPNumber() {
        return upperBPNumber;
    }

    public void setUpperBPNumber(int upperBPNumber) {
        this.upperBPNumber = upperBPNumber;
    }

    public int getLowerBPNumber() {
        return lowerBPNumber;
    }

    public void setLowerBPNumber(int lowerBPNumber) {
        this.lowerBPNumber = lowerBPNumber;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }
    //endregion
}

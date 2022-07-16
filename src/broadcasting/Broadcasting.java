package broadcasting;

public class Broadcasting { // Builder
    private int numOfInterview;
    private int numOfAdvertising;
    private int numOfSong;
    public static class Builder{
        private int numOfInterview;
        private int numOfAdvertising;
        private int numOfSong;

        public Builder numOfInterview(int numOfInterview) {
            this.numOfInterview=numOfInterview;
            return this;
        }
        public Builder numOfAdvertising(int numOfAdvertising) {
            this.numOfAdvertising=numOfAdvertising;
            return this;
        }
        public Builder numOfSong(int numOfSong) {
            this.numOfSong=numOfSong;
            return this;
        }
        public Broadcasting build() {
            Broadcasting broadcasting = new Broadcasting();
            broadcasting.numOfInterview = numOfInterview;
            broadcasting.numOfAdvertising = numOfAdvertising;
            broadcasting.numOfSong = numOfSong;
            return broadcasting;
        }


    }
    private Broadcasting(){}


    public int getNumOfInterview() {
        return numOfInterview;
    }

    public int getNumOfAdvertising() {
        return numOfAdvertising;
    }

    public int getNumOfSong() {
        return numOfSong;
    }
}

public class Header {
    String algo0;
    String algo1;

    public Header() {
    }

    public Header(String algo0, String algo1) {
        this.algo0 = algo0;
        this.algo1 = algo1;
    }

    public String getAlgo0() {
        return algo0;
    }

    public void setAlgo0(String algo0) {
        this.algo0 = algo0;
    }

    public String getAlgo1() {
        return algo1;
    }

    public void setAlgo1(String algo1) {
        this.algo1 = algo1;
    }

    @Override
    public String toString() {
        return "Header{" +
                "algo0='" + algo0 + '\'' +
                ", algo1='" + algo1 + '\'' +
                '}';
    }
}

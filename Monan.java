package khoapham.ptp.phamtanphat.sqlite;

public class Monan {
    private int id;
    private String tenmonan;
    private String giamonan;
    private String diachi;

    public Monan(int id, String tenmonan, String giamonan, String diachi) {
        this.id = id;
        this.tenmonan = tenmonan;
        this.giamonan = giamonan;
        this.diachi = diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenmonan() {
        return tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        this.tenmonan = tenmonan;
    }

    public String getGiamonan() {
        return giamonan;
    }

    public void setGiamonan(String giamonan) {
        this.giamonan = giamonan;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}

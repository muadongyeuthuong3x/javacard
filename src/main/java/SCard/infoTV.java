/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SCard;

/**
 *
 * @author Admin
 */
public class infoTV {
     private String hoten;
    private String ngaysinh;
    private String quequan;
    private String idtv;
    private String gioitinh;
    private String mapin;
    private byte[] avatar;
    private String tientk;
    public infoTV(String hoten, String ngaysinh, String quequan, String idtv, String gioitinh, String mapin,String tientk, byte[] avatar) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.quequan = quequan;
        this.idtv = idtv;
        this.gioitinh = gioitinh;
        this.mapin = mapin;
        this.tientk=tientk;
        this.avatar=avatar;
    }
    public infoTV(){
        
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }
    public String getHoten() {
        return hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public String getIdtv() {
        return idtv;
    }
    public String getTientk() {
        return tientk;
    }
     public void setTientk(String tien) {
        this.tientk = tien;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getMapin() {
        return mapin;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public void setIdtv(String idtv) {
        this.idtv = idtv;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setMapin(String mapin) {
        this.mapin = mapin;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SCard;

import java.util.List;
import javax.smartcardio.*;

/**
 *
 * @author Admin
 */
public class theTV {
    Card card;
    CardChannel channel;
    CommandAPDU cmndAPDU;
    ResponseAPDU resAPDU;
    
    public theTV(){
    }
    public boolean connectApplet(){
        try{
            // hiển thị danh sách các thiết bị đầu cuối có sẵn
            TerminalFactory factory = TerminalFactory.getDefault();
            List<CardTerminal> terminals = factory.terminals().list();
            System.out.println("Terminals: " + terminals);
            // lấy terminal đầu tiên
            CardTerminal terminal = terminals.get(0);
            // thiết lập kết nối với thẻ
            card = terminal.connect("*");
            System.out.println("card: " + card);
            //  lấy ATR
            ATR atr = card.getATR();
            byte[] baAtr = atr.getBytes();
            System.out.print("ATR = 0x");
            for(int i = 0; i < baAtr.length; i++ ){
                System.out.printf("%02X ",baAtr[i]);
            }
            channel = card.getBasicChannel();
            return true;
        } catch (CardException e){
            e.printStackTrace();
            return false;
    }
    }
    public void sendAPDUtoApplet(byte[] cmnds,byte[] data){
        try {
            resAPDU = channel.transmit(new CommandAPDU(cmnds[0], cmnds[1], cmnds[2], cmnds[3], data));
        } catch (CardException e) {
            e.printStackTrace();
        }
    }
    public void sendAPDUtoApplet(byte[] cmnds){
        try {
            resAPDU = channel.transmit(new CommandAPDU(cmnds[0], cmnds[1], cmnds[2], cmnds[3]));
        } catch (CardException e) {
            e.printStackTrace();
        }
    }
    public boolean disconnectApplet(){
        try {
            card.disconnect(false);
            return true;
        } catch (CardException e) {
            e.printStackTrace();
            return false;
        }
    }
    public String byteToHex(byte data) {
        StringBuilder result = new StringBuilder();
            result.append(String.format("%02x", data));
        return result.toString();
    }
    public String shorttoHex(short data) {
        StringBuilder result = new StringBuilder();
            result.append(String.format("%02x", data));
        return result.toString();
    }
}


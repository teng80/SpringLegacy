package com.lgy.spring_6_1;

public class Family {
   private String papaName;
   private String mamName;
   private String sisterName;
   private String brotherName;
   
   public Family(String papaName, String mamName) {
      this.papaName = papaName;
      this.mamName = mamName;
   }
   public String getPapaName() {
      return papaName;
   }
   public void setPapaName(String papaName) {
      this.papaName = papaName;
   }
   public String getMamName() {
      return mamName;
   }
   public void setMamName(String mamName) {
      this.mamName = mamName;
   }
   public String getSisterName() {
      return sisterName;
   }
   public void setSisterName(String sisterName) {
      this.sisterName = sisterName;
   }
   public String getBrotherName() {
      return brotherName;
   }
   public void setBrotherName(String brotherName) {
      this.brotherName = brotherName;
   }
}
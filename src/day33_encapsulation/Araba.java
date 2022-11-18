package day33_encapsulation;

public class Araba {

        String marka="marka belirtilmedi";

        public Araba(String marka) {
                this.marka = marka;
        }

        private   String model="model belirtilmedi";

      private   String yakit= "elektirikli";
      //private sadece o class da ulasilir


        public String getMarka() {
                return marka;
        }

        public void setMarka(String marka) {
                this.marka = marka;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public String getYakit() {
                return yakit;
        }

        public void setYakit(String yakit) {
                this.yakit = yakit;
        }
}

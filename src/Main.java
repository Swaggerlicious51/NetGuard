class Main{

    static class Banner{
        private String version;

        Banner(String version){
            this.version = version;
            
        }

        void showInfo(){
            System.out.println("=========================" + "\n" +
                            "     NetGuard v" + version + "\n" +
                            "     Security Toolkit  " + "\n" +
                            "=========================" + "\n" +
                            "1. Password Checker (coming soon)" + "\n" +
                            "2. Exit" + "\n" 
        );
            
        }
        

    }
    public static void main(String[] args){

            Banner banner = new Banner("0.1");
            banner.showInfo();
        
    }
}

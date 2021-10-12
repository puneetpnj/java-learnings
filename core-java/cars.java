class chevrolet {
    void wheels ()
    {
        System.out.println("Chevrolet wheels has michelin tyres");
    }
}
    class corvette extends chevrolet {
        void engine ()
        {
            System.out.println("Corvette cars have v8 engines");
        }
    }
        class singleinheritance {
            public static void main (String[]args){
                corvette c= new corvette();
                c.wheels ();
                c.engine ();

            }
        }




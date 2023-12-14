package pertemuan06;

class Bike {
    int speedlimit = 50;
}

class Honda3 extends Bike {

    int speedlimit = 40;
        public static void main(String[] args){
            Bike obj = new Honda3();
            System.out.println(obj.speedlimit);
        }    
}

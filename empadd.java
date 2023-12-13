public class empadd {
        long accountnumber;
        String location;
        String ifsc;
        Addressaggrecation address;

        public empadd(long accountnumber,String location,String ifsc, Addressaggrecation address){
            this.accountnumber=accountnumber;
            this.location=location;
            this.ifsc=ifsc;
            this.address=address;
        }
        void display(){
            System.out.println(accountnumber+" "+location+" "+ifsc);
            System.out.println(address.name+" "+address.balance+" "+address.mobilenumber+" "+address.age);
        }

        public static void main(String[]args){
            Addressaggrecation address1=new Addressaggrecation("prasanna",123,9876543210L,20);
            empadd e=new empadd(37930043782L,"chennai","SBIN0005593",address1);

            e.display();
        }
    }    


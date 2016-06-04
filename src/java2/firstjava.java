package java2;



		public class firstjava {
		public static	int myageis=20;
			public  firstjava(String Name){
				System.out.println("The name is:" +Name);
				
			}

			public void myage(int age){
			
				myageis=age;
				
				
			}
			
			public void getage(){
				System.out.println("My Age is:" +myageis);
				return;
			}
			
			
			
		   public static void main(String args[]){
			   firstjava i=new firstjava("Malik Nadeem");
		    
			   i.myage(15);
			   i.getage();
			   //System.out.println("My Age is:" +i.myageis);
			   
		   }
		}



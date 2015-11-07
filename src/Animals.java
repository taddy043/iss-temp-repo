
public class Animals {
	 public int hitPoints=0;
	 public short type;
	 private boolean predator=false;
	 private String name;
	 
	 public Animals(int hp,short tp,String n){
		 this.hitPoints=hp;
		 this.type=tp;
		 this.name=n;
		 switch(this.type){
		 case 1:
			 this.predator=true;
			 break;
		 case 2:
			 this.predator=true;
			 break;
		 case 3:
			 this.predator=false;
			 break;
		 case 4:
			 this.predator=false;
			 break;
			 
		 }
	 }
	 public String sayName() {
		 return this.name;
	 }
	 
	 void eat(Animals food){
		 if(this.predator==true){
			 this.hitPoints+=10;
		 }else{
			 this.hitPoints-=10;
			 if(this.hitPoints<=0){
				 System.out.println(this.name+"мёртв");
			 }
		 }
		 food.hitPoints=0;
	 }
	 
	 void eat(Fruit food){
		 if(this.predator==false){
			 this.hitPoints+=10;
		 }else{
			 this.hitPoints-=10;
			 if(this.hitPoints<=0){
				 System.out.println(this.name+"мёртв");
			 }
		 }
	 }

}
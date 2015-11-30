
public class Test {

	public static void main(String[] args) {
	Animals bear=new Animals(50,(short)1,"Bear");
	Animals wolf=new Animals(40,(short)2,"wolf");
	Animals deer=new Animals(30,(short)3,"deer");
	Animals boar=new Animals(20,(short)4,"boar");
	System.out.println(bear.sayName());
	System.out.println("hitsPoints: " +bear.hitPoints);
	bear.eat(new Animals(5,(short)3,"Deer2"));
	System.out.println("hitPoints: "+bear.hitPoints);
	bear.eat(new Fruit());
	System.out.println("hitPoints: "+bear.hitPoints);
	
	System.out.println(wolf.sayName());
	System.out.println("hitsPoints: " +wolf.hitPoints);
	wolf.eat(new Animals(5,(short)3,"Deer2"));
	System.out.println("hitPoints: "+wolf.hitPoints);
	wolf.eat(new Fruit());
	System.out.println("hitPoints: "+wolf.hitPoints);
	
	System.out.println(deer.sayName());
	System.out.println("hitsPoints: " +deer.hitPoints);
	deer.eat(new Animals(5,(short)3,"Deer2"));
	System.out.println("hitPoints: "+deer.hitPoints);
	deer.eat(new Fruit());
	System.out.println("hitPoints: "+deer.hitPoints);
	
	System.out.println(boar.sayName());
	System.out.println("hitsPoints: " +boar.hitPoints);
	boar.eat(new Animals(5,(short)3,"Deer2"));
	System.out.println("hitPoints: "+boar.hitPoints);
	boar.eat(new Fruit());
	System.out.println("hitPoints: "+boar.hitPoints);

	}

}

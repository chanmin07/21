class ch6_assignment implements Transport{
    public static void main(String[] args) {
        Transport[] tp = new Transport[3];
        tp[0] = new Bus("Bus", 2);
        tp[1] = new Truck("Truck", 4);
        tp[2] = new Ship("Ship", 200);
        
        for (int i = 0; i<3; i++) {
        	for(int j=0; j<3; j++) 
        		tp[i].ride();
        	tp[i].move();
            tp[i].stop();
        }
    }
    public void ride() {
        System.out.println("탔습니다.");
    }

    public void stop() {
        System.out.println("멈춥니다.");
    }

    public void move() {
        System.out.println("출발힙니다.");
    }

    public void getoff() {
        System.out.println("하차합니다.");
    }
}

interface Transport{
    public void ride();
    public void stop();
    public void move();
    public void getoff();
}

class Bus extends ch6_assignment{
    String type = "";
    int limit = 0;
    int Count = 0;
    
    public Bus(String type, int size){
    	this.type = type;
    	limit = size;
    }

    public void ride()
    {
        if(Count >= limit)
            System.out.println(type+"가 만원입니다.");
       
        else {
            System.out.println(type+"에 승객이 탔습니다.");
            Count++;
        }
    }

    public void stop() 
    {
    	System.out.println(type+"가 멈춥니다.");
    }
        
    public void move() {
        System.out.println(type+"가 출발합니다.");
    }

    public void getoff() {
        if(Count <= 0)
            System.out.println(type+"에 타고있는 승객이 없습니다.");
        else {
            System.out.println(type+"에 승객이 내렸습니다.");
            Count--;
        }
    }
}

class Truck extends ch6_assignment{
    String type = "";
    int limit = 0;
    int Count = 0;
    public Truck(String type, int size){
    	this.type = type;
    	limit = size;
    }

    public void ride()
    {
        if(Count >= limit)
            System.out.println(type+"에 짐이 가득 찼습니다.");
        else {
            System.out.println(type+"에 짐을 실었습니다.");
            Count++;
        }
    }

    public void stop() {
        System.out.println(type+"이 멈춥니다.");
    }

    public void move() {
        System.out.println(type+"이 출발합니다.");
    }

    public void getoff() {
        if(Count <= 0)
            System.out.println(type+"에 짐이 없습니다.");
        else {
            System.out.println(type+"에 짐을 뺐습니다.");
            Count--;
        }
    }
}

class Ship extends ch6_assignment{
    String type = "";
    int limit = 0;
    int Count = 0;
    public Ship(String type, int size){
    	this.type = type;
    	limit = size;
    }

    public void ride()
    {
        if(Count>=limit)
            System.out.println(type+"가 만원입니다.");
        else {
            System.out.println(type+"에 승객이 탔습니다.");
            Count++;
        }
    }
    
    public void stop() {
        System.out.println(type+"가 멈춥니다.");
    }

    public void move() {
        System.out.println(type+"가 출발합니다.");
    }

    public void getoff() {
        if(Count <= 0)
            System.out.println(type+"에 타고있는 승객이 없습니다.");
        else {
            System.out.println(type+"에 승객이 내렸습니다.");
            Count--;
        }
    }
}

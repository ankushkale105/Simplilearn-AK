package Assisted_Practice_Project_;

public class ConstructorsAnd_itsTypes {
		int id;
		String name;
		
		public ConstructorsAnd_itsTypes(String name, int id) {
			super();
			System.out.println("Parameterized Constructor");
			this.id=id;
			this.name = name;
		}
		public ConstructorsAnd_itsTypes() {
			super();
			System.out.println("Default Constructor");
		}
		
		public static void main(String[] args) {
			ConstructorsAnd_itsTypes p=new ConstructorsAnd_itsTypes();
			System.out.println(p.id+" "+p.name);
			ConstructorsAnd_itsTypes p1=new ConstructorsAnd_itsTypes("Aniket",10);
			System.out.println(p1.id+" "+p1.name);
		}
}

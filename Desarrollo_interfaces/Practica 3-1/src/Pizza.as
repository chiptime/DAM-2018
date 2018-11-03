package
{
	public class Pizza {
		private var nombre:String;
		private var base:String;
		private var toppings:Array;
		
		public function Pizza(nombre:String, base:String, toppings:Array) {		
			this.nombre = nombre;
			this.base = base;
			this.toppings = toppings;
		}
		public function getNombre():String
		{
			return this.nombre;
		}
		public function setNombre(nombre:String):void {
			this.nombre = nombre;
		}
		public function getBase():String {
			return this.base;
		}
		public function setBase(base:String):void {
			this.base = base;
		}
		public function getToppings():Array {
			return this.toppings;
		}
		public function setToppings(toppings:Array):void {
			this.toppings = toppings;
		}
		
		public function toString():String {
			return "Pizza [nombre=" + this.nombre + ", base=" + this.base + ", toppings=" +  this.toppings + "]";
		}	
	}
}
package
{
	public class Usuario
	{
		private var correo:String;
		private var contrasenia:String;
		private var nombre:String;
		
		public function Usuario(nombre:String, correo:String, contrasenia:String)
		{
			this.nombre = nombre;
			this.correo = correo;
			this.contrasenia = contrasenia;
		}
		public function getNombre():String
		{
			return nombre;
		}
		public function getCorreo():String
		{
			return correo;
		}
		public function getContrasenia():String
		{
			return contrasenia;
		}
		public function setCorreo(correo:String):void
		{
			this.correo = correo;
		}
		public function setContrasenia(contrasenia:String):void 
		{
			this.contrasenia = contrasenia;
		}
		public function setNombre(nombre:String):void
		{
			this.nombre = nombre;
		}
		
	}
}
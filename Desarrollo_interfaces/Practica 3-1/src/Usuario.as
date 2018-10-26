package
{
	public class Usuario
	{
		private var usuario:String;
		private var contrasenia:String;
		
		public function Usuario(usuario, contrasenia)
		{
			this.usuario = usuario;
			this.contrasenia = contrasenia;
		}		
		public function getUser(){
			return usuario;
		}
		public function getContrasenia(){
			return contrasenia;
		}
		public function setUser(String contrasenia){
			this.usuario = usuario;
		}
		public function setContrasenia(String contrasenia){
			this.contrasenia = contrasenia;
		}
		
	}
}
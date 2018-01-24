package ejercicioMovimiento;

public class HabilidadMotriz {
	
	public static class Limitada implements iMovimiento{
		public String muevete() {
			return "No me puedo mover, no puedo caminar";
		}

		@Override
		public String salta() {
			return "No puedo saltar";
		}
	}
	
	public static class Libre implements iMovimiento{
		public String muevete() {
			return "Me estoy moviendo, caminando";
		}

		@Override
		public String salta() {
			return "Estoy saltando";
		}
	}
}

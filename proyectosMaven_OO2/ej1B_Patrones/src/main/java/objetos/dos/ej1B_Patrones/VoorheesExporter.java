package objetos.dos.ej1B_Patrones;

import java.util.List;
import org.json.simple.*;

/*
 * no me suena que sea resolverlo asi porque no es implementar Adapter pero no se como hacerlo sino.
 */

public class VoorheesExporter {
	
	public JSONObject construirSocioEnJSON (Socio s) {
		JSONObject socioJS= new JSONObject();
		
		socioJS.put("nombre", s.getNombre());
		socioJS.put("email", s.getEmail());
		socioJS.put("legajo", s.getLegajo());
		
		return socioJS;
	}
	
	public String exportar(List<Socio> socios) {
		JSONArray arrDeSocios = new JSONArray();
		
		socios.stream().forEach(s -> arrDeSocios.add(this.construirSocioEnJSON(s)));
		
		return arrDeSocios.toJSONString(); //toString() retorna igual
	}
}

package DAOs.interfaces;

import java.util.List;

import modelo.Entidad.Coche;

public interface DaoCoche {

	public int create(Coche coche);

	public int delete(int id);

	public int update(int id);

	public Coche read(int id);

	public Coche readMat(String matricula);

	public List<Coche> readMarca(String marca);

	public List<Coche> readModelo(String modelo);

	public List<Coche> listCoches();

}

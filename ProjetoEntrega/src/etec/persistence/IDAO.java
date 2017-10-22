package etec.persistence;

public interface IDAO<T> {

	void inserir(T o) throws Exception;

	void compare() throws Exception;

}

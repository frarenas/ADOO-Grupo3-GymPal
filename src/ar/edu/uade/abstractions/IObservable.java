package ar.edu.uade.abstractions;

public interface IObservable {
    void agregar(IObserver observer);
    void eliminar(IObserver observer);
    void notificar();
}

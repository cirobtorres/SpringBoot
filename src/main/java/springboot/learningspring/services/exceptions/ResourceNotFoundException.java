package springboot.learningspring.services.exceptions;

public class ResourceNotFoundException extends RuntimeException { // Compilador não obriga a tratar
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}

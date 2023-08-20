package bcb.com.br.messages.exception;

public class ClientRequestException extends RuntimeException {

    public ClientRequestException() {
        super("error trying get client infos.");
    }
}

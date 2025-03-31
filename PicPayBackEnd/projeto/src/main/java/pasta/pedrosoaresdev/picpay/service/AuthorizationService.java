package pasta.pedrosoaresdev.picpay.service;

import org.springframework.stereotype.Service;
import pasta.pedrosoaresdev.picpay.client.AuthorizationClient;
import pasta.pedrosoaresdev.picpay.controller.dto.TransferDto;
import pasta.pedrosoaresdev.picpay.exception.PicPayException;

@Service
public class AuthorizationService {

    private final AuthorizationClient authorizationClient;

    public AuthorizationService(AuthorizationClient authorizationClient) {
        this.authorizationClient = authorizationClient;
    }

    public boolean isAuthorized(TransferDto transfer) {

        var resp = authorizationClient.isAuthorized();

        if (resp.getStatusCode().isError()) {
            throw new PicPayException();
        }

        return resp.getBody().authorized();
    }
}

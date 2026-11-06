package Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(name = "ICalculatrice")
public interface ICalculatrice {

    @WebMethod
    double somme(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );

    @WebMethod
    double multiplication(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );

    @WebMethod
    double soustraction(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );

    @WebMethod
    double division(
            @WebParam(name = "a") double a,
            @WebParam(name = "b") double b
    );
}

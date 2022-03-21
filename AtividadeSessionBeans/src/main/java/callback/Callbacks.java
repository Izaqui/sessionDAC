package callback;

import javax.annotation.*;
import javax.ejb.*;

@Stateless
public class Callbacks {

    @PostConstruct
    public void instanciaCriada(){
        //Este método será invocado pelo container sempre que uma nova instância for criada
    }

    @PreDestroy
    public void instanciaDestruida(){
        //Este método será invocado pelo container antes que uma instância seja destruída
    }

    @PrePassivate
    public void instanciaPassivada(){
        //Este método será invocado pelo container momentos antes de sofrer o processo de passivação
    }

    @PostActivate
    public void instanciaAtivada(){
        //Este método será invocado pelo container logo após o componente ser ativado
    }
}

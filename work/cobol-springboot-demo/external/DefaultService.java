package boc.java.external;

import javax.swing.SwingContainer;

import org.springframework.stereotype.Component;

import free.cobol2java.java.IService;

@Component
public class DefaultService implements IService {
    public void procedure(Object ...objects){
        System.out.print(getClass().getSimpleName()+":");
        for (Object elem : objects) {
            System.out.print(elem+",");
        }
        System.out.println();
    }
}

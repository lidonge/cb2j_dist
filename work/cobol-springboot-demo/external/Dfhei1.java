package boc.java.external;

import javax.swing.SwingContainer;

import org.springframework.stereotype.Component;

import free.cobol2java.java.IService;

@Component
public class Dfhei1 implements IService {
    public void procedure(Object ...objects){
        System.out.print("Dfhei1:");
        for (Object elem : objects) {
            System.out.print(elem+",");
        }
        System.out.println();
    }
}

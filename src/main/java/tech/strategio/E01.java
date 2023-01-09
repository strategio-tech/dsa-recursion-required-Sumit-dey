package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {
        // FIXME
    return func(n-1);
    }
    public int func(int m){
        if(m<=1)return m;
        return func(m-1)+func(m-2);
    }
}

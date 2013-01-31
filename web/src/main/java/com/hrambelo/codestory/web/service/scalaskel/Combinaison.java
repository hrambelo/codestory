package com.hrambelo.codestory.web.service.scalaskel;

/**
 * Created with IntelliJ IDEA.
 * User: bensmania <a href="mailto:bensmania@gmail.com">hrambelo</a>
 * Date: 31/01/13 - Time: 00:29
 * Package: com.hrambelo.codestory.business.scalaskel
 * Codestory
 */
public class Combinaison {

    private int baz;
    private int qix;
    private int bar;
    private int foo;

    /**
     * default no-arg construtor needed by JSON serializer
     */
    public Combinaison() {
    }

    /**
     * Constructor that creates an out of the box object
     * @param baz
     * @param qix
     * @param bar
     * @param foo
     */
    public Combinaison(int baz, int qix, int bar, int foo){
        this.baz = baz;
        this.qix = qix;
        this.bar = bar;
        this.foo = foo;
    }

    @Override
    public String toString() {
        return "{" +
                ((foo == 0) ? "" : "foo=" + foo) +
                ((bar == 0) ? "" : ", bar=" + bar) +
                ((qix == 0) ? "" : ", qix=" + qix) +
                ((baz == 0) ? "" : ", baz=" + baz) +
                '}';
    }

    /*Getters Setters*/
    public int getBaz() {
        return baz;
    }

    public int getQix() {
        return qix;
    }

    public int getBar() {
        return bar;
    }

    public int getFoo() {
        return foo;
    }

    public Combinaison setBaz(int baz) {
        this.baz = baz;
        return this;
    }

    public Combinaison setQix(int qix) {
        this.qix = qix;
        return this;
    }

    public Combinaison setBar(int bar) {
        this.bar = bar;
        return this;
    }

    public Combinaison setFoo(int foo) {
        this.foo = foo;
        return this;
    }
}

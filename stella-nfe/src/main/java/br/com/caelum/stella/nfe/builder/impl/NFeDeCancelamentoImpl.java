package br.com.caelum.stella.nfe.builder.impl;

import net.vidageek.fluid.proxy.ObjectCreator;
import br.com.caelum.stella.nfe.builder.NFe;
import br.com.caelum.stella.nfe.builder.NFeDeCancelamento;
import br.com.caelum.stella.nfe.builder.NFeWebServiceWrapper;
import br.com.caelum.stella.nfe.fluid.TCancNFe;
import br.com.caelum.stella.nfe.fluid.TProcCancNFe;

/**
 * @author jonasabreu
 * 
 */
final public class NFeDeCancelamentoImpl implements NFeDeCancelamento<NFe>, ObjectCreator {

    public NFeDeCancelamentoImpl(final NFe nfe) {
    }

    public NFeWebServiceWrapper<TCancNFe<NFe>> deNota() {
        return null;
    }

    public NFeWebServiceWrapper<TProcCancNFe<NFe>> deNotaProcessada() {
        return null;
    }

    public NFe build() {
        return null;
    }

    public Object getInstance() {
        return null;
    }

}

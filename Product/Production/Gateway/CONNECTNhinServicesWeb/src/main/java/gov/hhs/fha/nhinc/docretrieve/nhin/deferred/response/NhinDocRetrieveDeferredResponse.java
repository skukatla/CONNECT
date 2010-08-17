/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.hhs.fha.nhinc.docretrieve.nhin.deferred.response;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;

/**
 *
 * @author JHOPPESC
 */
@WebService(serviceName = "RespondingGatewayDeferredResponse_Retrieve_Service", portName = "RespondingGatewayDeferredResponse_Retrieve_Port_Soap", endpointInterface = "ihe.iti.xds_b._2007.RespondingGatewayDeferredResponseRetrievePortType", targetNamespace = "urn:ihe:iti:xds-b:2007", wsdlLocation = "WEB-INF/wsdl/NhinDocRetrieveDeferredResponse/NhinDocRetrieveDeferredResp.wsdl")
@BindingType(value = javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class NhinDocRetrieveDeferredResponse {
    @Resource
    private WebServiceContext context;

    public gov.hhs.healthit.nhin.DocRetrieveAcknowledgementType respondingGatewayDeferredResponseCrossGatewayRetrieve(ihe.iti.xds_b._2007.RetrieveDocumentSetResponseType body) {
        return new NhinDocRetrieveDeferredResponseImpl().respondingGatewayDeferredResponseCrossGatewayRetrieve(body, context);
    }

}
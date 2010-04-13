package gov.hhs.fha.nhinc.xdr.response.entity;

import javax.jws.WebService;

/**
 *
 * @author Neil Webb
 */
@WebService(serviceName = "EntityXDRResponse_Service", portName = "EntityXDRResponse_Port", endpointInterface = "gov.hhs.fha.nhinc.nhincentityxdr.async.response.EntityXDRResponsePortType", targetNamespace = "urn:gov:hhs:fha:nhinc:nhincentityxdr:async:response", wsdlLocation = "WEB-INF/wsdl/EntityEDRResponse/EntityXDRResponse.wsdl")
public class EntityEDRResponse
{

    public ihe.iti.xdr._2007.AcknowledgementType provideAndRegisterDocumentSetBResponse(gov.hhs.fha.nhinc.common.nhinccommonentity.RespondingGatewayProvideAndRegisterDocumentSetResponseRequestType provideAndRegisterDocumentSetResponseRequest)
    {
        return new EntityEDRResponseImpl().provideAndRegisterDocumentSetBResponse(provideAndRegisterDocumentSetResponseRequest);
    }

}
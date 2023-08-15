package checkVat.services.vies.taxud.eu.europa.ec;

public class CheckVatPortTypeProxy implements checkVat.services.vies.taxud.eu.europa.ec.CheckVatPortType {
  private String _endpoint = null;
  private checkVat.services.vies.taxud.eu.europa.ec.CheckVatPortType checkVatPortType = null;
  
  public CheckVatPortTypeProxy() {
    _initCheckVatPortTypeProxy();
  }
  
  public CheckVatPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initCheckVatPortTypeProxy();
  }
  
  private void _initCheckVatPortTypeProxy() {
    try {
      checkVatPortType = (new checkVat.services.vies.taxud.eu.europa.ec.CheckVatServiceLocator()).getcheckVatPort();
      if (checkVatPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)checkVatPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)checkVatPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (checkVatPortType != null)
      ((javax.xml.rpc.Stub)checkVatPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public checkVat.services.vies.taxud.eu.europa.ec.CheckVatPortType getCheckVatPortType() {
    if (checkVatPortType == null)
      _initCheckVatPortTypeProxy();
    return checkVatPortType;
  }
  
  @Override
public void checkVat(javax.xml.rpc.holders.StringHolder countryCode, javax.xml.rpc.holders.StringHolder vatNumber, org.apache.axis.holders.DateHolder requestDate, javax.xml.rpc.holders.BooleanHolder valid, javax.xml.rpc.holders.StringHolder name, javax.xml.rpc.holders.StringHolder address) throws java.rmi.RemoteException{
    if (checkVatPortType == null)
      _initCheckVatPortTypeProxy();
    checkVatPortType.checkVat(countryCode, vatNumber, requestDate, valid, name, address);
  }
  
  @Override
public void checkVatApprox(javax.xml.rpc.holders.StringHolder countryCode, javax.xml.rpc.holders.StringHolder vatNumber, javax.xml.rpc.holders.StringHolder traderName, javax.xml.rpc.holders.StringHolder traderCompanyType, javax.xml.rpc.holders.StringHolder traderStreet, javax.xml.rpc.holders.StringHolder traderPostcode, javax.xml.rpc.holders.StringHolder traderCity, java.lang.String requesterCountryCode, java.lang.String requesterVatNumber, org.apache.axis.holders.DateHolder requestDate, javax.xml.rpc.holders.BooleanHolder valid, javax.xml.rpc.holders.StringHolder traderAddress, types.checkVat.services.vies.taxud.eu.europa.ec.holders.MatchCodeHolder traderNameMatch, types.checkVat.services.vies.taxud.eu.europa.ec.holders.MatchCodeHolder traderCompanyTypeMatch, types.checkVat.services.vies.taxud.eu.europa.ec.holders.MatchCodeHolder traderStreetMatch, types.checkVat.services.vies.taxud.eu.europa.ec.holders.MatchCodeHolder traderPostcodeMatch, types.checkVat.services.vies.taxud.eu.europa.ec.holders.MatchCodeHolder traderCityMatch, javax.xml.rpc.holders.StringHolder requestIdentifier) throws java.rmi.RemoteException{
    if (checkVatPortType == null)
      _initCheckVatPortTypeProxy();
    checkVatPortType.checkVatApprox(countryCode, vatNumber, traderName, traderCompanyType, traderStreet, traderPostcode, traderCity, requesterCountryCode, requesterVatNumber, requestDate, valid, traderAddress, traderNameMatch, traderCompanyTypeMatch, traderStreetMatch, traderPostcodeMatch, traderCityMatch, requestIdentifier);
  }
  
  
}
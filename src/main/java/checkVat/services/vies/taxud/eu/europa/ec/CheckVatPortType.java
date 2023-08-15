/**
 * CheckVatPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package checkVat.services.vies.taxud.eu.europa.ec;

public interface CheckVatPortType extends java.rmi.Remote {
    public void checkVat(javax.xml.rpc.holders.StringHolder countryCode, javax.xml.rpc.holders.StringHolder vatNumber, org.apache.axis.holders.DateHolder requestDate, javax.xml.rpc.holders.BooleanHolder valid, javax.xml.rpc.holders.StringHolder name, javax.xml.rpc.holders.StringHolder address) throws java.rmi.RemoteException;
    public void checkVatApprox(javax.xml.rpc.holders.StringHolder countryCode, javax.xml.rpc.holders.StringHolder vatNumber, javax.xml.rpc.holders.StringHolder traderName, javax.xml.rpc.holders.StringHolder traderCompanyType, javax.xml.rpc.holders.StringHolder traderStreet, javax.xml.rpc.holders.StringHolder traderPostcode, javax.xml.rpc.holders.StringHolder traderCity, java.lang.String requesterCountryCode, java.lang.String requesterVatNumber, org.apache.axis.holders.DateHolder requestDate, javax.xml.rpc.holders.BooleanHolder valid, javax.xml.rpc.holders.StringHolder traderAddress, types.checkVat.services.vies.taxud.eu.europa.ec.holders.MatchCodeHolder traderNameMatch, types.checkVat.services.vies.taxud.eu.europa.ec.holders.MatchCodeHolder traderCompanyTypeMatch, types.checkVat.services.vies.taxud.eu.europa.ec.holders.MatchCodeHolder traderStreetMatch, types.checkVat.services.vies.taxud.eu.europa.ec.holders.MatchCodeHolder traderPostcodeMatch, types.checkVat.services.vies.taxud.eu.europa.ec.holders.MatchCodeHolder traderCityMatch, javax.xml.rpc.holders.StringHolder requestIdentifier) throws java.rmi.RemoteException;
}

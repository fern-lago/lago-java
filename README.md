# lago-java-client

Lago API documentation

- API version: 0.53.0-beta

- Build date: 2023-12-27T14:12:55.372025191Z[Etc/UTC]

Lago API allows your application to push customer information and metrics (events) from your application to the billing application.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Current Releases

| Project            | Release Badge                                                                                       |
|--------------------|-----------------------------------------------------------------------------------------------------|
| **Lago**           | [![Lago Release](https://img.shields.io/github/v/release/getlago/lago)](https://github.com/getlago/lago/releases) |
| **lago-java-client**     | [![lago-java-client Release](https://img.shields.io/github/v/release/getlago/lago-java-client)](https://github.com/getlago/lago-java-client/releases) |

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>lago-java-client</artifactId>
  <version>0.53.0-beta</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'lago-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'lago-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:lago-java-client:0.53.0-beta"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/lago-java-client-0.53.0-beta.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.getlago.client.*;
import org.getlago.client.auth.*;
import org.openapitools.client.model.*;
import org.getlago.client.api.AddOnsApi;

public class AddOnsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.getlago.com/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AddOnsApi apiInstance = new AddOnsApi(defaultClient);
        AddOnCreateInput addOnCreateInput = new AddOnCreateInput(); // AddOnCreateInput | Add-on payload
        try {
            AddOn result = apiInstance.createAddOn(addOnCreateInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddOnsApi#createAddOn");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.getlago.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddOnsApi* | [**createAddOn**](docs/AddOnsApi.md#createAddOn) | **POST** /add_ons | Create an add-on
*AddOnsApi* | [**destroyAddOn**](docs/AddOnsApi.md#destroyAddOn) | **DELETE** /add_ons/{code} | Delete an add-on
*AddOnsApi* | [**findAddOn**](docs/AddOnsApi.md#findAddOn) | **GET** /add_ons/{code} | Retrieve an add-on
*AddOnsApi* | [**findAllAddOns**](docs/AddOnsApi.md#findAllAddOns) | **GET** /add_ons | List all add-ons
*AddOnsApi* | [**updateAddOn**](docs/AddOnsApi.md#updateAddOn) | **PUT** /add_ons/{code} | Update an add-on
*AnalyticsApi* | [**findAllGrossRevenues**](docs/AnalyticsApi.md#findAllGrossRevenues) | **GET** /analytics/gross_revenue | List gross revenue
*AnalyticsApi* | [**findAllInvoiceCollections**](docs/AnalyticsApi.md#findAllInvoiceCollections) | **GET** /analytics/invoice_collection | List of finalized invoices
*AnalyticsApi* | [**findAllInvoicedUsages**](docs/AnalyticsApi.md#findAllInvoicedUsages) | **GET** /analytics/invoiced_usage | List usage revenue
*AnalyticsApi* | [**findAllMrrs**](docs/AnalyticsApi.md#findAllMrrs) | **GET** /analytics/mrr | List MRR
*BillableMetricsApi* | [**createBillableMetric**](docs/BillableMetricsApi.md#createBillableMetric) | **POST** /billable_metrics | Create a billable metric
*BillableMetricsApi* | [**destroyBillableMetric**](docs/BillableMetricsApi.md#destroyBillableMetric) | **DELETE** /billable_metrics/{code} | Delete a billable metric
*BillableMetricsApi* | [**findAllBillableMetricGroups**](docs/BillableMetricsApi.md#findAllBillableMetricGroups) | **GET** /billable_metrics/{code}/groups | Find a billable metric&#39;s groups
*BillableMetricsApi* | [**findAllBillableMetrics**](docs/BillableMetricsApi.md#findAllBillableMetrics) | **GET** /billable_metrics | List all billable metrics
*BillableMetricsApi* | [**findBillableMetric**](docs/BillableMetricsApi.md#findBillableMetric) | **GET** /billable_metrics/{code} | Retrieve a billable metric
*BillableMetricsApi* | [**updateBillableMetric**](docs/BillableMetricsApi.md#updateBillableMetric) | **PUT** /billable_metrics/{code} | Update a billable metric
*CouponsApi* | [**applyCoupon**](docs/CouponsApi.md#applyCoupon) | **POST** /applied_coupons | Apply a coupon to a customer
*CouponsApi* | [**createCoupon**](docs/CouponsApi.md#createCoupon) | **POST** /coupons | Create a coupon
*CouponsApi* | [**deleteAppliedCoupon**](docs/CouponsApi.md#deleteAppliedCoupon) | **DELETE** /customers/{external_customer_id}/applied_coupons/{applied_coupon_id} | Delete an applied coupon
*CouponsApi* | [**destroyCoupon**](docs/CouponsApi.md#destroyCoupon) | **DELETE** /coupons/{code} | Delete a coupon
*CouponsApi* | [**findAllAppliedCoupons**](docs/CouponsApi.md#findAllAppliedCoupons) | **GET** /applied_coupons | List all applied coupons
*CouponsApi* | [**findAllCoupons**](docs/CouponsApi.md#findAllCoupons) | **GET** /coupons | List all coupons
*CouponsApi* | [**findCoupon**](docs/CouponsApi.md#findCoupon) | **GET** /coupons/{code} | Retrieve a coupon
*CouponsApi* | [**updateCoupon**](docs/CouponsApi.md#updateCoupon) | **PUT** /coupons/{code} | Update a coupon
*CreditNotesApi* | [**createCreditNote**](docs/CreditNotesApi.md#createCreditNote) | **POST** /credit_notes | Create a credit note
*CreditNotesApi* | [**downloadCreditNote**](docs/CreditNotesApi.md#downloadCreditNote) | **POST** /credit_notes/{lago_id}/download | Download a credit note PDF
*CreditNotesApi* | [**estimateCreditNote**](docs/CreditNotesApi.md#estimateCreditNote) | **POST** /credit_notes/estimate | Estimate amounts for a new credit note
*CreditNotesApi* | [**findAllCreditNotes**](docs/CreditNotesApi.md#findAllCreditNotes) | **GET** /credit_notes | List all credit notes
*CreditNotesApi* | [**findCreditNote**](docs/CreditNotesApi.md#findCreditNote) | **GET** /credit_notes/{lago_id} | Retrieve a credit note
*CreditNotesApi* | [**updateCreditNote**](docs/CreditNotesApi.md#updateCreditNote) | **PUT** /credit_notes/{lago_id} | Update a credit note
*CreditNotesApi* | [**voidCreditNote**](docs/CreditNotesApi.md#voidCreditNote) | **PUT** /credit_notes/{lago_id}/void | Void a credit note
*CustomersApi* | [**createCustomer**](docs/CustomersApi.md#createCustomer) | **POST** /customers | Create a customer
*CustomersApi* | [**deleteAppliedCoupon**](docs/CustomersApi.md#deleteAppliedCoupon) | **DELETE** /customers/{external_customer_id}/applied_coupons/{applied_coupon_id} | Delete an applied coupon
*CustomersApi* | [**destroyCustomer**](docs/CustomersApi.md#destroyCustomer) | **DELETE** /customers/{external_id} | Delete a customer
*CustomersApi* | [**findAllCustomerPastUsage**](docs/CustomersApi.md#findAllCustomerPastUsage) | **GET** /customers/{external_customer_id}/past_usage | Retrieve customer past usage
*CustomersApi* | [**findAllCustomers**](docs/CustomersApi.md#findAllCustomers) | **GET** /customers | List all customers
*CustomersApi* | [**findCustomer**](docs/CustomersApi.md#findCustomer) | **GET** /customers/{external_id} | Retrieve a customer
*CustomersApi* | [**findCustomerCurrentUsage**](docs/CustomersApi.md#findCustomerCurrentUsage) | **GET** /customers/{external_customer_id}/current_usage | Retrieve customer current usage
*CustomersApi* | [**generateCustomerCheckoutURL**](docs/CustomersApi.md#generateCustomerCheckoutURL) | **POST** /customers/{external_customer_id}/checkout_url | Generate a Customer Payment Provider Checkout URL
*CustomersApi* | [**getCustomerPortalUrl**](docs/CustomersApi.md#getCustomerPortalUrl) | **GET** /customers/{external_customer_id}/portal_url | Get a customer portal URL
*EventsApi* | [**createBatchEvents**](docs/EventsApi.md#createBatchEvents) | **POST** /events/batch | Batch multiple events
*EventsApi* | [**createEvent**](docs/EventsApi.md#createEvent) | **POST** /events | Send usage events
*EventsApi* | [**eventEstimateFees**](docs/EventsApi.md#eventEstimateFees) | **POST** /events/estimate_fees | Estimate fees for a pay in advance charge
*EventsApi* | [**findEvent**](docs/EventsApi.md#findEvent) | **GET** /events/{transaction_id} | Retrieve a specific event
*FeesApi* | [**findAllFees**](docs/FeesApi.md#findAllFees) | **GET** /fees | List all fees
*FeesApi* | [**findFee**](docs/FeesApi.md#findFee) | **GET** /fees/{lago_id} | Retrieve a specific fee
*FeesApi* | [**updateFee**](docs/FeesApi.md#updateFee) | **PUT** /fees/{lago_id} | Update a fee
*InvoicesApi* | [**createInvoice**](docs/InvoicesApi.md#createInvoice) | **POST** /invoices | Create a one-off invoice
*InvoicesApi* | [**downloadInvoice**](docs/InvoicesApi.md#downloadInvoice) | **POST** /invoices/{lago_id}/download | Download an invoice PDF
*InvoicesApi* | [**finalizeInvoice**](docs/InvoicesApi.md#finalizeInvoice) | **PUT** /invoices/{lago_id}/finalize | Finalize a draft invoice
*InvoicesApi* | [**findAllInvoices**](docs/InvoicesApi.md#findAllInvoices) | **GET** /invoices | List all invoices
*InvoicesApi* | [**findInvoice**](docs/InvoicesApi.md#findInvoice) | **GET** /invoices/{lago_id} | Retrieve an invoice
*InvoicesApi* | [**refreshInvoice**](docs/InvoicesApi.md#refreshInvoice) | **PUT** /invoices/{lago_id}/refresh | Refresh a draft invoice
*InvoicesApi* | [**retryPayment**](docs/InvoicesApi.md#retryPayment) | **POST** /invoices/{lago_id}/retry_payment | Retry an invoice payment
*InvoicesApi* | [**updateInvoice**](docs/InvoicesApi.md#updateInvoice) | **PUT** /invoices/{lago_id} | Update an invoice
*InvoicesApi* | [**voidInvoice**](docs/InvoicesApi.md#voidInvoice) | **POST** /invoices/{lago_id}/void | Void an invoice
*OrganizationsApi* | [**updateOrganization**](docs/OrganizationsApi.md#updateOrganization) | **PUT** /organizations | Update your organization
*PlansApi* | [**createPlan**](docs/PlansApi.md#createPlan) | **POST** /plans | Create a plan
*PlansApi* | [**destroyPlan**](docs/PlansApi.md#destroyPlan) | **DELETE** /plans/{code} | Delete a plan
*PlansApi* | [**findAllPlans**](docs/PlansApi.md#findAllPlans) | **GET** /plans | List all plans
*PlansApi* | [**findPlan**](docs/PlansApi.md#findPlan) | **GET** /plans/{code} | Retrieve a plan
*PlansApi* | [**updatePlan**](docs/PlansApi.md#updatePlan) | **PUT** /plans/{code} | Update a plan
*SubscriptionsApi* | [**createSubscription**](docs/SubscriptionsApi.md#createSubscription) | **POST** /subscriptions | Assign a plan to a customer
*SubscriptionsApi* | [**destroySubscription**](docs/SubscriptionsApi.md#destroySubscription) | **DELETE** /subscriptions/{external_id} | Terminate a subscription
*SubscriptionsApi* | [**findAllSubscriptions**](docs/SubscriptionsApi.md#findAllSubscriptions) | **GET** /subscriptions | List all subscriptions
*SubscriptionsApi* | [**findSubscription**](docs/SubscriptionsApi.md#findSubscription) | **GET** /subscriptions/{external_id} | Retrieve a subscription
*SubscriptionsApi* | [**updateSubscription**](docs/SubscriptionsApi.md#updateSubscription) | **PUT** /subscriptions/{external_id} | Update a subscription
*TaxesApi* | [**createTax**](docs/TaxesApi.md#createTax) | **POST** /taxes | Create a tax
*TaxesApi* | [**destroyTax**](docs/TaxesApi.md#destroyTax) | **DELETE** /taxes/{code} | Delete a tax
*TaxesApi* | [**findAllTaxes**](docs/TaxesApi.md#findAllTaxes) | **GET** /taxes | List all taxes
*TaxesApi* | [**findTax**](docs/TaxesApi.md#findTax) | **GET** /taxes/{code} | Retrieve a Tax
*TaxesApi* | [**updateTax**](docs/TaxesApi.md#updateTax) | **PUT** /taxes/{code} | Update a tax
*WalletsApi* | [**createWallet**](docs/WalletsApi.md#createWallet) | **POST** /wallets | Create a wallet
*WalletsApi* | [**createWalletTransaction**](docs/WalletsApi.md#createWalletTransaction) | **POST** /wallet_transactions | Top up a wallet
*WalletsApi* | [**destroyWallet**](docs/WalletsApi.md#destroyWallet) | **DELETE** /wallets/{lago_id} | Terminate a wallet
*WalletsApi* | [**findAllWalletTransactions**](docs/WalletsApi.md#findAllWalletTransactions) | **GET** /wallets/{lago_id}/wallet_transactions | List all wallet transactions
*WalletsApi* | [**findAllWallets**](docs/WalletsApi.md#findAllWallets) | **GET** /wallets | List all wallets
*WalletsApi* | [**findWallet**](docs/WalletsApi.md#findWallet) | **GET** /wallets/{lago_id} | Retrieve a wallet
*WalletsApi* | [**updateWallet**](docs/WalletsApi.md#updateWallet) | **PUT** /wallets/{lago_id} | Update a wallet
*WebhookEndpointsApi* | [**createWebhookEndpoint**](docs/WebhookEndpointsApi.md#createWebhookEndpoint) | **POST** /webhook_endpoints | Create a webhook_endpoint
*WebhookEndpointsApi* | [**destroyWebhookEndpoint**](docs/WebhookEndpointsApi.md#destroyWebhookEndpoint) | **DELETE** /webhook_endpoints/{lago_id} | Delete a webhook endpoint
*WebhookEndpointsApi* | [**findAllWebhookEndpoints**](docs/WebhookEndpointsApi.md#findAllWebhookEndpoints) | **GET** /webhook_endpoints | List all webhook endpoints
*WebhookEndpointsApi* | [**findWebhookEndpoint**](docs/WebhookEndpointsApi.md#findWebhookEndpoint) | **GET** /webhook_endpoints/{lago_id} | Retrieve a webhook endpoint
*WebhookEndpointsApi* | [**updateWebhookEndpoint**](docs/WebhookEndpointsApi.md#updateWebhookEndpoint) | **PUT** /webhook_endpoints/{lago_id} | Update a webhook endpoint
*WebhooksApi* | [**fetchPublicKey**](docs/WebhooksApi.md#fetchPublicKey) | **GET** /webhooks/public_key | Retrieve webhook public key


## Documentation for Models

 - [AddOn](docs/AddOn.md)
 - [AddOnBaseInput](docs/AddOnBaseInput.md)
 - [AddOnCreateInput](docs/AddOnCreateInput.md)
 - [AddOnCreateInputAddOn](docs/AddOnCreateInputAddOn.md)
 - [AddOnObject](docs/AddOnObject.md)
 - [AddOnUpdateInput](docs/AddOnUpdateInput.md)
 - [AddOnsPaginated](docs/AddOnsPaginated.md)
 - [ApiErrorBadRequest](docs/ApiErrorBadRequest.md)
 - [ApiErrorForbidden](docs/ApiErrorForbidden.md)
 - [ApiErrorNotAllowed](docs/ApiErrorNotAllowed.md)
 - [ApiErrorNotFound](docs/ApiErrorNotFound.md)
 - [ApiErrorUnauthorized](docs/ApiErrorUnauthorized.md)
 - [ApiErrorUnprocessableEntity](docs/ApiErrorUnprocessableEntity.md)
 - [AppliedCoupon](docs/AppliedCoupon.md)
 - [AppliedCouponInput](docs/AppliedCouponInput.md)
 - [AppliedCouponInputAppliedCoupon](docs/AppliedCouponInputAppliedCoupon.md)
 - [AppliedCouponObject](docs/AppliedCouponObject.md)
 - [AppliedCouponObjectExtended](docs/AppliedCouponObjectExtended.md)
 - [AppliedCouponsPaginated](docs/AppliedCouponsPaginated.md)
 - [BaseAppliedTax](docs/BaseAppliedTax.md)
 - [BillableMetric](docs/BillableMetric.md)
 - [BillableMetricBaseInput](docs/BillableMetricBaseInput.md)
 - [BillableMetricCreateInput](docs/BillableMetricCreateInput.md)
 - [BillableMetricCreateInputBillableMetric](docs/BillableMetricCreateInputBillableMetric.md)
 - [BillableMetricGroup](docs/BillableMetricGroup.md)
 - [BillableMetricGroupValuesInner](docs/BillableMetricGroupValuesInner.md)
 - [BillableMetricGroupValuesInnerOneOf](docs/BillableMetricGroupValuesInnerOneOf.md)
 - [BillableMetricObject](docs/BillableMetricObject.md)
 - [BillableMetricUpdateInput](docs/BillableMetricUpdateInput.md)
 - [BillableMetricsPaginated](docs/BillableMetricsPaginated.md)
 - [ChargeObject](docs/ChargeObject.md)
 - [ChargeObjectProperties](docs/ChargeObjectProperties.md)
 - [ChargeProperties](docs/ChargeProperties.md)
 - [ChargePropertiesGraduatedPercentageRangesInner](docs/ChargePropertiesGraduatedPercentageRangesInner.md)
 - [ChargePropertiesGraduatedRangesInner](docs/ChargePropertiesGraduatedRangesInner.md)
 - [ChargePropertiesVolumeRangesInner](docs/ChargePropertiesVolumeRangesInner.md)
 - [Country](docs/Country.md)
 - [Coupon](docs/Coupon.md)
 - [CouponBaseInput](docs/CouponBaseInput.md)
 - [CouponBaseInputAppliesTo](docs/CouponBaseInputAppliesTo.md)
 - [CouponCreateInput](docs/CouponCreateInput.md)
 - [CouponCreateInputCoupon](docs/CouponCreateInputCoupon.md)
 - [CouponObject](docs/CouponObject.md)
 - [CouponUpdateInput](docs/CouponUpdateInput.md)
 - [CouponsPaginated](docs/CouponsPaginated.md)
 - [CreditNote](docs/CreditNote.md)
 - [CreditNoteAppliedTaxObject](docs/CreditNoteAppliedTaxObject.md)
 - [CreditNoteCreateInput](docs/CreditNoteCreateInput.md)
 - [CreditNoteCreateInputCreditNote](docs/CreditNoteCreateInputCreditNote.md)
 - [CreditNoteEstimateInput](docs/CreditNoteEstimateInput.md)
 - [CreditNoteEstimateInputCreditNote](docs/CreditNoteEstimateInputCreditNote.md)
 - [CreditNoteEstimateInputCreditNoteItemsInner](docs/CreditNoteEstimateInputCreditNoteItemsInner.md)
 - [CreditNoteEstimated](docs/CreditNoteEstimated.md)
 - [CreditNoteEstimatedEstimatedCreditNote](docs/CreditNoteEstimatedEstimatedCreditNote.md)
 - [CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner](docs/CreditNoteEstimatedEstimatedCreditNoteAppliedTaxesInner.md)
 - [CreditNoteEstimatedEstimatedCreditNoteItemsInner](docs/CreditNoteEstimatedEstimatedCreditNoteItemsInner.md)
 - [CreditNoteItemObject](docs/CreditNoteItemObject.md)
 - [CreditNoteItemObjectFee](docs/CreditNoteItemObjectFee.md)
 - [CreditNoteObject](docs/CreditNoteObject.md)
 - [CreditNoteUpdateInput](docs/CreditNoteUpdateInput.md)
 - [CreditNoteUpdateInputCreditNote](docs/CreditNoteUpdateInputCreditNote.md)
 - [CreditNotes](docs/CreditNotes.md)
 - [CreditObject](docs/CreditObject.md)
 - [CreditObjectInvoice](docs/CreditObjectInvoice.md)
 - [CreditObjectItem](docs/CreditObjectItem.md)
 - [Currency](docs/Currency.md)
 - [Customer](docs/Customer.md)
 - [CustomerBillingConfiguration](docs/CustomerBillingConfiguration.md)
 - [CustomerChargeUsageObject](docs/CustomerChargeUsageObject.md)
 - [CustomerChargeUsageObjectBillableMetric](docs/CustomerChargeUsageObjectBillableMetric.md)
 - [CustomerChargeUsageObjectCharge](docs/CustomerChargeUsageObjectCharge.md)
 - [CustomerChargeUsageObjectGroupsInner](docs/CustomerChargeUsageObjectGroupsInner.md)
 - [CustomerCreateInput](docs/CustomerCreateInput.md)
 - [CustomerCreateInputCustomer](docs/CustomerCreateInputCustomer.md)
 - [CustomerCreateInputCustomerMetadataInner](docs/CustomerCreateInputCustomerMetadataInner.md)
 - [CustomerMetadata](docs/CustomerMetadata.md)
 - [CustomerObject](docs/CustomerObject.md)
 - [CustomerObjectExtended](docs/CustomerObjectExtended.md)
 - [CustomerPastUsage](docs/CustomerPastUsage.md)
 - [CustomerUsage](docs/CustomerUsage.md)
 - [CustomerUsageObject](docs/CustomerUsageObject.md)
 - [CustomersPaginated](docs/CustomersPaginated.md)
 - [Event](docs/Event.md)
 - [EventBatchInput](docs/EventBatchInput.md)
 - [EventBatchInputEvent](docs/EventBatchInputEvent.md)
 - [EventBatchInputEventProperties](docs/EventBatchInputEventProperties.md)
 - [EventEstimateFeesInput](docs/EventEstimateFeesInput.md)
 - [EventEstimateFeesInputEvent](docs/EventEstimateFeesInputEvent.md)
 - [EventInput](docs/EventInput.md)
 - [EventInputEvent](docs/EventInputEvent.md)
 - [EventInputEventTimestamp](docs/EventInputEventTimestamp.md)
 - [EventObject](docs/EventObject.md)
 - [EventObjectProperties](docs/EventObjectProperties.md)
 - [Fee](docs/Fee.md)
 - [FeeAppliedTaxObject](docs/FeeAppliedTaxObject.md)
 - [FeeObject](docs/FeeObject.md)
 - [FeeObjectAmountDetails](docs/FeeObjectAmountDetails.md)
 - [FeeObjectAmountDetailsAllOfGraduatedPercentageRangesInner](docs/FeeObjectAmountDetailsAllOfGraduatedPercentageRangesInner.md)
 - [FeeObjectAmountDetailsAllOfGraduatedRangesInner](docs/FeeObjectAmountDetailsAllOfGraduatedRangesInner.md)
 - [FeeObjectAmountDetailsAllOfVolumeRangesInner](docs/FeeObjectAmountDetailsAllOfVolumeRangesInner.md)
 - [FeeObjectItem](docs/FeeObjectItem.md)
 - [FeeUpdateInput](docs/FeeUpdateInput.md)
 - [FeeUpdateInputFee](docs/FeeUpdateInputFee.md)
 - [Fees](docs/Fees.md)
 - [FeesPaginated](docs/FeesPaginated.md)
 - [GenerateCustomerCheckoutURL200Response](docs/GenerateCustomerCheckoutURL200Response.md)
 - [GetCustomerPortalUrl200Response](docs/GetCustomerPortalUrl200Response.md)
 - [GetCustomerPortalUrl200ResponseCustomer](docs/GetCustomerPortalUrl200ResponseCustomer.md)
 - [GrossRevenueObject](docs/GrossRevenueObject.md)
 - [GrossRevenues](docs/GrossRevenues.md)
 - [GroupObject](docs/GroupObject.md)
 - [GroupPropertiesObject](docs/GroupPropertiesObject.md)
 - [GroupPropertiesObjectValues](docs/GroupPropertiesObjectValues.md)
 - [GroupsPaginated](docs/GroupsPaginated.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceAppliedTaxObject](docs/InvoiceAppliedTaxObject.md)
 - [InvoiceCollectionObject](docs/InvoiceCollectionObject.md)
 - [InvoiceCollections](docs/InvoiceCollections.md)
 - [InvoiceMetadataObject](docs/InvoiceMetadataObject.md)
 - [InvoiceObject](docs/InvoiceObject.md)
 - [InvoiceObjectCustomer](docs/InvoiceObjectCustomer.md)
 - [InvoiceObjectExtended](docs/InvoiceObjectExtended.md)
 - [InvoiceOneOffCreateInput](docs/InvoiceOneOffCreateInput.md)
 - [InvoiceOneOffCreateInputInvoice](docs/InvoiceOneOffCreateInputInvoice.md)
 - [InvoiceOneOffCreateInputInvoiceFeesInner](docs/InvoiceOneOffCreateInputInvoiceFeesInner.md)
 - [InvoiceUpdateInput](docs/InvoiceUpdateInput.md)
 - [InvoiceUpdateInputInvoice](docs/InvoiceUpdateInputInvoice.md)
 - [InvoiceUpdateInputInvoiceMetadataInner](docs/InvoiceUpdateInputInvoiceMetadataInner.md)
 - [InvoicedUsageObject](docs/InvoicedUsageObject.md)
 - [InvoicedUsages](docs/InvoicedUsages.md)
 - [InvoicesPaginated](docs/InvoicesPaginated.md)
 - [MrrObject](docs/MrrObject.md)
 - [Mrrs](docs/Mrrs.md)
 - [Organization](docs/Organization.md)
 - [OrganizationBillingConfiguration](docs/OrganizationBillingConfiguration.md)
 - [OrganizationObject](docs/OrganizationObject.md)
 - [OrganizationUpdateInput](docs/OrganizationUpdateInput.md)
 - [OrganizationUpdateInputOrganization](docs/OrganizationUpdateInputOrganization.md)
 - [PaginationMeta](docs/PaginationMeta.md)
 - [Plan](docs/Plan.md)
 - [PlanCreateInput](docs/PlanCreateInput.md)
 - [PlanCreateInputPlan](docs/PlanCreateInputPlan.md)
 - [PlanCreateInputPlanChargesInner](docs/PlanCreateInputPlanChargesInner.md)
 - [PlanCreateInputPlanChargesInnerGroupPropertiesInner](docs/PlanCreateInputPlanChargesInnerGroupPropertiesInner.md)
 - [PlanObject](docs/PlanObject.md)
 - [PlanOverridesObject](docs/PlanOverridesObject.md)
 - [PlanOverridesObjectChargesInner](docs/PlanOverridesObjectChargesInner.md)
 - [PlanUpdateInput](docs/PlanUpdateInput.md)
 - [PlanUpdateInputPlan](docs/PlanUpdateInputPlan.md)
 - [PlanUpdateInputPlanChargesInner](docs/PlanUpdateInputPlanChargesInner.md)
 - [PlansPaginated](docs/PlansPaginated.md)
 - [Subscription](docs/Subscription.md)
 - [SubscriptionCreateInput](docs/SubscriptionCreateInput.md)
 - [SubscriptionCreateInputSubscription](docs/SubscriptionCreateInputSubscription.md)
 - [SubscriptionObject](docs/SubscriptionObject.md)
 - [SubscriptionObjectExtended](docs/SubscriptionObjectExtended.md)
 - [SubscriptionUpdateInput](docs/SubscriptionUpdateInput.md)
 - [SubscriptionUpdateInputSubscription](docs/SubscriptionUpdateInputSubscription.md)
 - [SubscriptionsPaginated](docs/SubscriptionsPaginated.md)
 - [Tax](docs/Tax.md)
 - [TaxBaseInput](docs/TaxBaseInput.md)
 - [TaxCreateInput](docs/TaxCreateInput.md)
 - [TaxCreateInputTax](docs/TaxCreateInputTax.md)
 - [TaxObject](docs/TaxObject.md)
 - [TaxUpdateInput](docs/TaxUpdateInput.md)
 - [TaxesPaginated](docs/TaxesPaginated.md)
 - [Timezone](docs/Timezone.md)
 - [Wallet](docs/Wallet.md)
 - [WalletCreateInput](docs/WalletCreateInput.md)
 - [WalletCreateInputWallet](docs/WalletCreateInputWallet.md)
 - [WalletCreateInputWalletRecurringTransactionRulesInner](docs/WalletCreateInputWalletRecurringTransactionRulesInner.md)
 - [WalletObject](docs/WalletObject.md)
 - [WalletObjectRecurringTransactionRulesInner](docs/WalletObjectRecurringTransactionRulesInner.md)
 - [WalletTransactionCreateInput](docs/WalletTransactionCreateInput.md)
 - [WalletTransactionCreateInputWalletTransaction](docs/WalletTransactionCreateInputWalletTransaction.md)
 - [WalletTransactionObject](docs/WalletTransactionObject.md)
 - [WalletTransactions](docs/WalletTransactions.md)
 - [WalletTransactionsPaginated](docs/WalletTransactionsPaginated.md)
 - [WalletUpdateInput](docs/WalletUpdateInput.md)
 - [WalletUpdateInputWallet](docs/WalletUpdateInputWallet.md)
 - [WalletUpdateInputWalletRecurringTransactionRulesInner](docs/WalletUpdateInputWalletRecurringTransactionRulesInner.md)
 - [WalletsPaginated](docs/WalletsPaginated.md)
 - [WebhookEndpoint](docs/WebhookEndpoint.md)
 - [WebhookEndpointCreateInput](docs/WebhookEndpointCreateInput.md)
 - [WebhookEndpointCreateInputWebhookEndpoint](docs/WebhookEndpointCreateInputWebhookEndpoint.md)
 - [WebhookEndpointObject](docs/WebhookEndpointObject.md)
 - [WebhookEndpointUpdateInput](docs/WebhookEndpointUpdateInput.md)
 - [WebhookEndpointsPaginated](docs/WebhookEndpointsPaginated.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="bearerAuth"></a>
### bearerAuth


- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

tech@getlago.com


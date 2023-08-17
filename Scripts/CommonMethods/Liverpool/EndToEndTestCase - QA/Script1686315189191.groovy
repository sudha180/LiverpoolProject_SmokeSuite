import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import customkeywords.myKeywords as myKeywords

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dtaqa.liverpool.com.mx/tienda')

WebUI.maximizeWindow()

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/Logo_hp'))

WebUI.verifyElementPresent(findTestObject('HomePage/Logo_hp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/searchTextbox_hp'))

WebUI.verifyElementPresent(findTestObject('HomePage/searchTextbox_hp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/a_Mis Compras_hp'))

WebUI.verifyElementPresent(findTestObject('HomePage/a_Mis Compras_hp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/span_Iniciar sesin_hp'))

WebUI.verifyElementPresent(findTestObject('HomePage/span_Iniciar sesin_hp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/bagIcon_hp'))

WebUI.verifyElementPresent(findTestObject('HomePage/bagIcon_hp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/multiSites_hp'))

WebUI.verifyElementPresent(findTestObject('HomePage/multiSites_hp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/span_Categoras_hp'))

WebUI.verifyElementPresent(findTestObject('HomePage/span_Categoras_hp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePage/primaryBanner_hp (1)'))

not_run: WebUI.verifyElementPresent(findTestObject('HomePage/primaryBanner_hp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/secondaryBanner_hp'))

WebUI.verifyElementPresent(findTestObject('HomePage/secondaryBanner_hp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/carousel1_hp'))

WebUI.verifyElementPresent(findTestObject('HomePage/carousel1_hp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePageShubhum/footer_hp'))

WebUI.verifyElementPresent(findTestObject('HomePage/footer_hp (1)'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/clickIniciarSession_Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : 'UN85@digisprint.com', ('password') : 'Un85@12345'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePageShubhum/span_Iniciar sesin_hp'))

not_run: CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePageShubhum/button_Iniciar sesin_login'))

not_run: CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePageShubhum/span_Categoras_hp'))

WebUI.click(findTestObject('HomePage/span_Categoras_hp (1)'))

not_run: CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePageShubhum/l1Category_hp'))

WebUI.click(findTestObject('HomePage/L1Category_HP (1)'))

WebUI.delay(3)

not_run: WebUI.verifyElementPresent(findTestObject('0BLPPage/breadCrumb_blp'))

WebUI.verifyElementPresent(findTestObject('0BLPPage/breadCrumb_blp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('0BLPPage/l2Category_blp'))

WebUI.verifyElementPresent(findTestObject('0BLPPage/l2Category_blp (1)'), 0)

WebUI.delay(3)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

not_run: WebUI.click(findTestObject('0BLPPage/l2Category_blp'))

WebUI.click(findTestObject('0BLPPage/l2Category_blp (1)'))

not_run: WebUI.verifyElementPresent(findTestObject('CLPPage/breadCrumb_clp'), 0)

WebUI.verifyElementPresent(findTestObject('CLPPage/breadCrumb_clp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CLPPage/a_Ver todo_clp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CLPPage/l3Category_clp'), 0)

WebUI.verifyElementPresent(findTestObject('CLPPage/l3Category_clp (1)'), 0)

not_run: WebUI.click(findTestObject('CLPPage/l3Category_clp'))

WebUI.delay(3)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/breadCrumb_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/breadCrumb_plp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/div_Categoras_plp'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'vaso'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/div_Marcas_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/div_Precios_plp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/div_Tamao_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/div_Vendido por_plp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/div_Vendido por_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/label_Color_plp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/label_Color_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/label_Descuentos_plp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/label_Descuentos_plp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('PLPPage/productName_plp'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/productName_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/productImage2_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/listView_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/gridView_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/button_Relevancia_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/button_Lo Ms Nuevo_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/button_Mayor precio_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/button_Menor precio_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('PLPPage/button_Calificaciones_plp (1)'), 0)

WebUI.click(findTestObject('PLPPage/a_Color_variants-normalizedColor-Blanco_plp (1)'))

not_run: WebUI.click(findTestObject('PLPPage/a_Color_variants-normalizedColor-Blanco_plp'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('PLPPage/a_Limpiar Filtros_plp (1)'), 0)

WebUI.click(findTestObject('PLPPage/a_Limpiar Filtros_plp (1)'))

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/carousel_plp'))

not_run: WebUI.click(findTestObject('PLPPage/goToTop'))

WebUI.click(findTestObject('PLPPage/productImage2_plp (1)'))

WebUI.delay(3)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

not_run: WebUI.verifyElementPresent(findTestObject('PDPpage/breadCrumb_pdp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/breadCrumb_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/alternateImages_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/ProductImage_pdp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/Quantity(plus)_PDP'), 0)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('PDPpage/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('PDPpage/discountPrice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/ITRLink_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/span_Compartir_pdp'), 0)

<<<<<<< HEAD
WebUI.verifyElementPresent(findTestObject('PDPpage/AddToCart_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/h3_Opiniones del artculo_pdp'), 0)
=======
WebUI.verifyElementPresent(findTestObject('PDPpage/p_Ver ms promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/button_Agregar a mi bolsa_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('PDPpage/h3_Opiniones del artculo_pdp'), 0)

WebUI.delay(3)
>>>>>>> c5118e61b2b767707a82ef53c8b9cfcf8096a13a

not_run: WebUI.click(findTestObject('PDPpage/selectSize1'))

WebUI.verifyElementPresent(findTestObject('PDPpage/Quantity(plus)_PDP'), 0)

<<<<<<< HEAD
not_run: WebUI.click(findTestObject('PDPpage/selectSize1'))
=======
WebUI.click(findTestObject('PDPpage/selectSize1'))

WebUI.delay(3)
>>>>>>> c5118e61b2b767707a82ef53c8b9cfcf8096a13a

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('PDPpage/carousels_pdp'))

not_run: WebUI.click(findTestObject('PDPpage/button_Agregar a mi bolsa_pdp'))

WebUI.click(findTestObject('PDPpage/AddToCart_PDP'))

not_run: WebUI.click(findTestObject('HomePageShubhum/bagIcon_hp'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.delay(3)

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('CartPage/span_Mi Bolsa_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/myBagImageProduct_cart (1)'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/productName_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/productPrice_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_EliminarIcon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/totalPrice_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CartPage/button_mesaDeRegalos_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Mover a Wishlist_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Eliminar_cart (1)'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Comprarahora_cart (1)'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/priceSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_Comprar_cart (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('CartPage/div_Entregaestimada_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/div_carouselSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('CartPage/button_SeguirComprando_cart'), 0)

WebUI.click(findTestObject('CartPage/button_Comprar_cart (1)'))

WebUI.delay(3)

ActualOPCPageUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('checkoutpage/h4_Confirma tu compra_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/deliveryAddressHeading_address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/label_Cambiar_Address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/Forma de Pago_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/paymentSection_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/label_Cambiar_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productSection_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/productImage_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productName_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productprice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/totalPrice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/promotionSection_opc (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Comprar para mesa de regalos_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Mover a Wishlist_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Eliminar_opc'), 0)

WebUI.verifyElementPresent(findTestObject('OPCPage/button_Cupones_opc (1)'), 0)

WebUI.click(findTestObject('OPCPage/label_Cambiar_payment_opc'))

WebUI.click(findTestObject('OPCPage/button_Efectivo y Transferencias_payment_opc (1)'))

not_run: WebUI.click(findTestObject('OPCPage/button_Continuar_payment_opc 1'))

WebUI.click(findTestObject('OPCPage/button_Continuar_payment_opc 1'))

WebUI.delay(4)

WebUI.click(findTestObject('OPCPage/button_Finalizar compra_opc (1)'))

WebUI.delay(3)

actualConfirmationUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/gracias por comprar_confirmation (1)'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/a_Mis compras_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productDetailHeading_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productImage_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/div_Entrega estimada_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/addressSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/paymentSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/totalPrice_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/legalInfo_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/button_Descargar ticket de pago_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/referenceNumber_confirmation'), 0)

referenceNumber_confirmation = WebUI.getText(findTestObject('ConfirmationPage/referenceNumber_confirmation'))

not_run: WebUI.verifyElementPresent(findTestObject('ConfirmationPage/carousel_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/button_Continuar comprando_confirmation'), 0)

WebUI.click(findTestObject('ConfirmationPage/button_Descargar ticket de pago_confirmation'))

WebUI.click(findTestObject('ConfirmationPage/button_Ir a Mis compras_confirmation'))

WebUI.delay(3)

actualMisComprasUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.setText(findTestObject('MyOrderesPage/mainSearchbar_misCompras'), referenceNumber_confirmation)

WebUI.sendKeys(findTestObject('MyOrderesPage/mainSearchbar_misCompras'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/breadCrumb_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/aside_leftNavigation_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/mainSearchbar_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/span_Filtrar compras_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/productName_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/img_product__image_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/button_Comprar nuevamente__misCompras'), 0)

WebUI.click(findTestObject('MyOrderesPage/button_Ver detalle de compra_misCompras'))

WebUI.delay(3)

actualMisComprasUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('OrderDetailsPage/h1_Detalle de compra_orderDetails'), 0)

WebUI.verifyElementPresent(findTestObject('OrderDetailsPage/addressSection_orderDetails'), 0)

WebUI.verifyElementPresent(findTestObject('OrderDetailsPage/paymentSection_orderDetails'), 0)

WebUI.verifyElementPresent(findTestObject('OrderDetailsPage/productDetails_orderDetails'), 0)

WebUI.verifyElementPresent(findTestObject('OrderDetailsPage/referenceNumber_orderDetails'), 0)

WebUI.verifyTextPresent(referenceNumber_confirmation, false)


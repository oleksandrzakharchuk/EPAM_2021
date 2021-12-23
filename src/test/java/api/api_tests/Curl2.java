package api.api_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Curl2 {
    @Test
    public void testListOfUserswShema() {
        RestAssured.given().log().all()
                .baseUri("https://www.dropbox.com")
                .basePath("/home")
                .contentType(ContentType.JSON)
                //.body("{\"channel_states\":[{\"channel_id\":{\"app_id\":\"contacts_cache_notify\",\"unique_id\":\"3721979584\"},\"revision\":\"1640288557893151331\",\"token\":\"CprS6qQ7VJvzz+lt59JJb7YJTL+H9zEv2gN2E9HIZjff5fRvdI8RpFtnVZC/lyCvYxmVuEF2jke2FsD+24We9AxAsryHhIEKUGDb/VXr+yCaoAAzX7OksdhJp8OkE6NTa12g1VDotdThIgMmyy+4Gg+x\"}]}")
                .when()
                .get()
                .then()
                .log()
                .all()
        .statusCode(200);
        //.body(matchesJsonSchemaInClasspath("postLisOfUsersShemas.json"));

    }
}

//Request method:	GET
//Request URI:	https://www.dropbox.com/home
//Proxy:			<none>
//Request params:	<none>
//Query params:	<none>
//Form params:	<none>
//Path params:	<none>
//Headers:		Accept=*/*
//				Content-Type=application/json
//Cookies:		<none>
//Multiparts:		<none>
//Body:			<none>
//HTTP/1.1 200 OK
//Cache-Control: no-cache,no-cache, no-store
//Content-Security-Policy: base-uri 'self' ; child-src https://www.dropbox.com/static/serviceworker/ blob: ; connect-src https://* ws://127.0.0.1:*/ws ; default-src 'none' ; font-src https://* data: ; form-action 'self' https://www.dropbox.com/ https://dl-web.dropbox.com/ https://photos.dropbox.com/ https://paper.dropbox.com/ https://showcase.dropbox.com/ https://www.hellofax.com/ https://app.hellofax.com/ https://www.hellosign.com/ https://app.hellosign.com/ https://docsend.com/ https://www.docsend.com/ https://help.dropbox.com/ https://navi.dropbox.jp/ https://selfguidedlearning.dropboxbusiness.com/ https://instructorledlearning.dropboxbusiness.com/ https://sales.dropboxbusiness.com/ https://dropboxconnect.co.uk/ https://accounts.google.com/ https://api.login.yahoo.com/ https://login.yahoo.com/ https://experience.dropbox.com/ https://pal-test.adyen.com https://2e83413d8036243b-Dropbox-pal-live.adyenpayments.com/ ; frame-src https://* carousel: dbapi-6: dbapi-7: dbapi-8: dropbox-client: itms-apps: itms-appss: ; img-src https://* data: blob: ; media-src https://* blob: ; object-src 'self' https://cfl.dropboxstatic.com/static/ https://www.dropboxstatic.com/static/ ; report-uri https://www.dropbox.com/csp_log?policy_name=metaserver-whitelist ; script-src 'unsafe-eval' https://www.dropbox.com/static/api/ https://www.dropbox.com/page_success/ https://cfl.dropboxstatic.com/static/js/ https://www.dropboxstatic.com/static/js/ https://cfl.dropboxstatic.com/static/src/dws-ensemble-appshell/ https://www.dropboxstatic.com/static/src/dws-ensemble-appshell/ https://cfl.dropboxstatic.com/static/previews/ https://www.dropboxstatic.com/static/previews/ https://cfl.dropboxstatic.com/static/api/ https://www.dropboxstatic.com/static/api/ https://cfl.dropboxstatic.com/static/cms/ https://www.dropboxstatic.com/static/cms/ https://www.google.com/recaptcha/ https://www.gstatic.com/recaptcha/ 'unsafe-inline' ; style-src https://* 'unsafe-inline' 'unsafe-eval' ; worker-src https://www.dropbox.com/static/serviceworker/ blob:
//Referrer-Policy: strict-origin-when-cross-origin
//Set-Cookie: gvc=MjIwMTQ1NjA2NjkyOTQ1MDEwMzE3MTU4MzQ2MDE3NTM4NTIwNjI4; expires=Tue, 22 Dec 2026 20:09:47 GMT; HttpOnly; Path=/; Secure
//Set-Cookie: t=8NawuVeS0SRrXrywAZaBjXKu; Domain=dropbox.com; expires=Sun, 22 Dec 2024 20:09:47 GMT; HttpOnly; Path=/; Secure
//Set-Cookie: __Host-js_csrf=8NawuVeS0SRrXrywAZaBjXKu; expires=Sun, 22 Dec 2024 20:09:47 GMT; Path=/; Secure
//Set-Cookie: locale=en; Domain=dropbox.com; expires=Tue, 22 Dec 2026 20:09:47 GMT; Path=/; Secure
//X-Content-Type-Options: nosniff
//X-Frame-Options: SAMEORIGIN
//X-Permitted-Cross-Domain-Policies: none
//X-Server-Response-Time: 56
//X-Xss-Protection: 1; mode=block
//Content-Type: text/html; charset=utf-8
//Accept-Encoding: identity,gzip
//Date: Thu, 23 Dec 2021 20:09:47 GMT
//Server: envoy
//Strict-Transport-Security: max-age=31536000; includeSubDomains
//Strict-Transport-Security: max-age=31536000; includeSubDomains
//Strict-Transport-Security: max-age=31536000; includeSubDomains; preload
//Content-Encoding: gzip
//Vary: Accept-Encoding
//X-Dropbox-Response-Origin: far_remote
//X-Dropbox-Request-Id: 29f40557f1794442871dae8a0ebc60ab
//Transfer-Encoding: chunked
//
//<html class="media-desktop" lang="en" lang="en">
//  <head>
//    <script nonce="fuJJ+lMnDfU+SKy8WPUX">
//window._goch_ = {};
//window.addEventListener('click', function(event) {
//    'use strict';
//    for (var elm = event.target; elm; elm = elm.parentElement) {
//        if (elm.id &amp;&amp;
//            window._goch_.hasOwnProperty(elm.id) &amp;&amp;
//            window._goch_[elm.id].call(elm, event) === false) {
//            event.preventDefault();
//        }
//    }
//}, true);
//window._csp_external_script_nonce = "dTJHawH7eaWVRj4oeSVP"</script>
//    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1"/>
//    <link href="https://www.dropbox.com/login" rel="canonical"/>
//    <link href="https://cfl.dropboxstatic.com/static/images/favicon-vfl8lUR9B.ico" rel="shortcut icon"/>
//    <link href="https://cfl.dropboxstatic.com/static/css/main-vfls47iWm.css" rel="stylesheet" type="text/css"/>
//    <script type="text/javascript" nonce="fuJJ+lMnDfU+SKy8WPUX">window.ST=+new Date();</script>
//    <link href="https://cfl.dropboxstatic.com/static/images/logo_catalog/dropbox_webclip_60_vis.png" rel="apple-touch-icon"/>
//    <link href="https://cfl.dropboxstatic.com/static/images/logo_catalog/dropbox_webclip_76_vis.png" rel="apple-touch-icon" sizes="76x76"/>
//    <link href="https://cfl.dropboxstatic.com/static/images/logo_catalog/dropbox_webclip_120_vis.png" rel="apple-touch-icon" sizes="120x120"/>
//    <link href="https://cfl.dropboxstatic.com/static/images/logo_catalog/dropbox_webclip_152_vis.png" rel="apple-touch-icon" sizes="152x152"/>
//    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
//    <meta content="Login - Dropbox " property="og:title"/>
//    <meta content="Login to Dropbox. Bring your photos, docs, and videos anywhere and keep your files safe." property="og:description"/>
//    <meta content="https://www.dropbox.com/login?cont=https%3A%2F%2Fwww.dropbox.com%2Fhome" property="og:url"/>
//    <meta content="website" property="og:type"/>
//    <meta content="Dropbox" property="og:site_name"/>
//    <meta content="210019893730" property="fb:app_id"/>
//    <meta content="https://cfl.dropboxstatic.com/static/images/logo_catalog/dropbox_webclip_200_vis.png" property="og:image"/>
//    <meta content="200" property="og:image:width"/>
//    <meta content="200" property="og:image:height"/>
//    <meta name="twitter:card" content="summary"/>
//    <meta name="twitter:site" content="@Dropbox"/>
//    <meta name="twitter:url" content="https://www.dropbox.com/login?cont=https%3A%2F%2Fwww.dropbox.com%2Fhome"/>
//    <meta name="twitter:title" content="Login - Dropbox "/>
//    <meta name="twitter:description" content="Login to Dropbox. Bring your photos, docs, and videos anywhere and keep your files safe."/>
//    <meta name="twitter:image" content="https://cfl.dropboxstatic.com/static/images/logo_catalog/dropbox_webclip_200_vis.png"/>
//    <meta name="google-site-verification" content="TnuSyOnBMNmtugbpL1ZvW2PbSF9LKvoTzrvOGS9h-b0"/>
//    <meta name="google-site-verification" content="EZKIczQcM1-DVUMz8heu1dIhNtxNbLqbaA9-HbOnCQ4"/>
//    <meta name="norton-safeweb-site-verification" content="tz8iotmk-pkhui406y41y5bfmfxdwmaa4a-yc0hm6r0fga7s6j0j27qmgqkmc7oovihzghbzhbdjk-uiyrz438nxsjdbj3fggwgl8oq2nf4ko8gi7j4z7t78kegbidl4"/>
//    <meta name="msapplication-TileImage" content="https://cfl.dropboxstatic.com/static/images/logo_catalog/logo_m1.png"/>
//    <meta name="msapplication-TileColor" content="#ffffff"/>
//    <meta name="description" content="Login to Dropbox. Bring your photos, docs, and videos anywhere and keep your files safe."/>
//    <title>Login - Dropbox </title>
//    <style type="text/css">.hny-baokq { display: none; }</style>
//    <link crossorigin="anonymous" href="https://cfl.dropboxstatic.com/static/css/components/button-vfllw60O5.css" rel="stylesheet" type="text/css"/>
//    <link crossorigin="anonymous" href="https://cfl.dropboxstatic.com/static/css/components/react_locale_selector-vflJH-b9A.css" rel="stylesheet" type="text/css"/>
//    <link crossorigin="anonymous" href="https://cfl.dropboxstatic.com/static/css/dropbox/2015/layout-vflvc3veE.css" rel="stylesheet" type="text/css"/>
//    <link crossorigin="anonymous" href="https://cfl.dropboxstatic.com/static/css/dropbox/2015/pages/index-vflK1gzWT.css" rel="stylesheet" type="text/css"/>
//    <link crossorigin="anonymous" href="https://cfl.dropboxstatic.com/static/css/dropbox/base-vfloOI4PY.css" rel="stylesheet" type="text/css"/>
//    <link crossorigin="anonymous" href="https://cfl.dropboxstatic.com/static/css/font_atlas_grotesk-vfldINMge.css" rel="stylesheet" type="text/css"/>
//    <link crossorigin="anonymous" href="https://cfl.dropboxstatic.com/static/css/font_sharp_grotesk-vfle4tE4q.css" rel="stylesheet" type="text/css"/>
//    <link crossorigin="anonymous" href="https://cfl.dropboxstatic.com/static/css/notify-vflZVEumu.css" rel="stylesheet" type="text/css"/>
//    <link crossorigin="anonymous" href="https://cfl.dropboxstatic.com/static/css/privacy_consent/privacy_consent-vflwboZY9.css" rel="stylesheet" type="text/css"/>
//    <link crossorigin="anonymous" href="https://cfl.dropboxstatic.com/static/css/sprites/web_sprites-vflcKH0r6.css" rel="stylesheet" type="text/css"/>
//    <link href="https://fonts.googleapis.com/css?family=Open+Sans:100,200,300,400,600,700&amp;subset=latin,latin-ext" rel="stylesheet" type="text/css"/>
//    <script type="text/javascript" nonce="fuJJ+lMnDfU+SKy8WPUX">
//            (function(){"use strict";var e,n=window,r=function(){e=[],n.addRequireLoadCallback=function(n){return e.push(n)},n.configureRequire=function(){var e=arguments;n.addRequireLoadCallback((function(){return n.configureRequire.apply(null,e)}))},n.define=function(){var e=arguments;n.addRequireLoadCallback((function(){return n.define.apply(null,e)}))},n.preLoadFile=function(){for(var e=[],r=0;r&lt;arguments.length;r++)e[r]=arguments[r];n.addRequireLoadCallback((function(){return n.preLoadFile.apply(null,e)}))}};r(),n._insertRequireShim=r,n.InitRequireJs=function(r){n.requireContexts={},n.performance&amp;&amp;null!=n.performance.now&amp;&amp;(requirejs.onResourceLoad=function(e,r,a){var i=n.performance.now(),u=n.requireContexts[e.id];if(u){r.id in u.module_callback_times||(u.module_callback_times[r.id]={});var o=u.module_callback_times[r.id];o.loadTime=i,r.url&amp;&amp;(o.url=r.url),r.id&amp;&amp;(o.name=r.id),r.parentMap&amp;&amp;r.parentMap.url&amp;&amp;(o.parent=r.parentMap.url)}}),n.configureRequire=r,n.addRequireLoadCallback=function(e){return e()},e.forEach((function(e){return e()}))}})();
//
//
//            window.CSP_SCRIPT_NONCE = "fuJJ+lMnDfU+SKy8WPUX";
//            </script>
//    <script async="async" crossorigin="anonymous" src="https://cfl.dropboxstatic.com/static/js/alameda_bundle/alameda_bundle_ie_en-vfl_85v6j.js" type="text/javascript" nonce="dTJHawH7eaWVRj4oeSVP"/>
//    <script type="text/javascript" nonce="fuJJ+lMnDfU+SKy8WPUX">
//                var same_hostname = false;
//                try {
//                    same_hostname = (top.location.hostname === self.location.hostname);
//                } catch (error) {}
//
//                if (self != top &amp;&amp; !same_hostname) {
//                    try {top.location.replace(self.location.href);} catch (e) {console.error(e);}
//                    setTimeout(function() {
//                        window.DB_FRAME_BUST = true;
//                        var frameBustImg = "https://cfl.dropboxstatic.com/static/images/logo-vflL7Ces6.png";
//                        document.body.innerHTML = (
//                            "&lt;img src='" + frameBustImg + "' id='frame-bust-image' /&gt;");
//                        document.getElementById('frame-bust-image').addEventListener('click', function(evt) {
//                            top.location.href = window.location.href;
//                        });
//                    }, 1);
//                }
//            </script>
//  </head>
//  <body class="en login-or-register-page" dir="ltr">
//    <div class="uxa-modal" id="modal-behind" style="display: none;"/>
//    <div id="modal" style="display: none;">
//      <div id="modal-box">
//        <a shape="rect" id="modal-x" aria-label="Close" href="#"/>
//        <h2 id="modal-title"/>
//        <div id="modal-content"/>
//      </div>
//    </div>
//    <div id="modal-overlay" style="display: none;"/>
//    <div id="grave-yard" style="display:none"/>
//    <div id="trash-can" style="display:none"/>
//    <script id="tutorial_nav_bubble_tmpl" type="text/template" nonce="fuJJ+lMnDfU+SKy8WPUX">&lt;div class="tutorial-bubble-content"&gt;&lt;a class="tutorial-bubble-x-link"&gt;&lt;img class="tutorial-bubble-x-img" src="/static/images/x-small-active.png" /&gt;&lt;/a&gt;&lt;h1 class="tutorial-bubble-title"&gt;&lt;%= TEMPLATE_DATA.title %&gt;&lt;/h1&gt;&lt;p class="tutorial-bubble-body"&gt;&lt;%= TEMPLATE_DATA.body %&gt;&lt;/p&gt;&lt;a class="tutorial-bubble-button &lt;%= TEMPLATE_DATA.button_class %&gt;"&gt;&lt;%= TEMPLATE_DATA.button_text %&gt;&lt;/a&gt;&lt;/div&gt;</script>
//    <div id="floaters"/>
//    <div class="external-drop-indicator top" style="display: none;"/>
//    <div class="external-drop-indicator right" style="display: none;"/>
//    <div class="external-drop-indicator bottom" style="display: none;"/>
//    <div class="external-drop-indicator left" style="display: none;"/>
//    <span class="dropbox-2015 dropbox-logo-2015">
//      <header class="mast-head">
//        <div class="mast-head__container container">
//          <nav class="mast-head__nav mast-head-nav">
//            <ul class="nav-list">
//              <li class="nav-list__item nav-list__item--dfb">
//                <a shape="rect" class="button-tertiary try-dfb" id="try-dfb" href="/business">Try Dropbox Business</a>
//              </li>
//            </ul>
//            <ul class="nav-list">
//              <li class="nav-list__item nav-list__item--download">
//                <a shape="rect" class="button-link" href="/downloading?src=index">Download the app</a>
//              </li>
//            </ul>
//          </nav>
//          <h1 class="dropbox-logo" id="dropbox-logo">
//            <a shape="rect" class="dropbox-logo__link" href="/">
//              <img class="dropbox-logo__glyph" alt="" src="https://cfl.dropboxstatic.com/static/images/logo_catalog/dropbox_logo_glyph_2015_m1.svg"/>
//              <img class="dropbox-logo__type" alt="" src="https://cfl.dropboxstatic.com/static/images/logo_catalog/dropbox_logo_text_2015_m1.svg"/>
//Dropbox            </a>
//          </h1>
//        </div>
//      </header>
//    </span>
//    <div id="outer-frame">
//      <div id="page-content">
//        <div class="main-skip-destination" id="main-skip" tabindex="-1"/>
//        <div id="component3890191328821095615">
//          <div class="react-stub"/>
//        </div>
//      </div>
//      <div id="page-prefooter"/>
//      <footer>
//        <div id="page-full-footer">
//          <div id="footer-top-margin"/>
//          <div id="footer-border"/>
//          <div class="footer-col">
//            <ul>
//              <li class="header">Dropbox</li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/install">Install</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/mobile">Mobile</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/pricing">Pricing</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/business">Business</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/enterprise">Enterprise</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/features?trigger=footer">Features</a>
//              </li>
//            </ul>
//          </div>
//          <div class="footer-col">
//            <ul>
//              <li class="header">About us</li>
//              <li>
//                <a shape="rect" href="http://blog.dropbox.com/">Dropbox Blog</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/about">About</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/branding">Branding</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/news">News</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/jobs">Jobs</a>
//              </li>
//            </ul>
//          </div>
//          <div class="footer-col">
//            <ul>
//              <li class="header">Support</li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/help">Help Center</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/contact">Contact us</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/dmca">Copyright</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/terms/cookies">Cookies</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/privacy">Privacy &amp; Terms</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/sitemap">Sitemap</a>
//              </li>
//            </ul>
//          </div>
//          <div class="footer-col">
//            <ul>
//              <li class="header">Community</li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/referrals">Referrals</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropboxforum.com">Forum</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://twitter.com/dropbox" rel="noreferrer" target="_blank">Twitter</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://facebook.com/Dropbox" rel="noreferrer" target="_blank">Facebook</a>
//              </li>
//              <li>
//                <a shape="rect" href="https://www.dropbox.com/developers">Developers</a>
//              </li>
//            </ul>
//          </div>
//          <div class="react-locale-selector-wrapper">
//            <div id="component3890191328821095616">
//              <div class="react-stub"/>
//            </div>
//          </div>
//          <div class="clear"/>
//        </div>
//      </footer>
//      <noscript>
//        <p class="center">The Dropbox website requires JavaScript.</p>
//      </noscript>
//    </div>
//    <div id="ieconsole" style="position: absolute; top: 0; left: 0; font-family: Courier"/>
//    <div id="FB_HiddenContainer" style="position:absolute; top:-10000px;width:0px; height:0px; left: 0;"/>
//    <script type="text/javascript" nonce="fuJJ+lMnDfU+SKy8WPUX">define("modules/constants/env", [], function() {
//            return {"BATCH_THUMB_ENDPOINTS": [], "LIVE_TRANSCODE_SERVER": "showbox-tr.dropbox.com", "STATIC_CONTENT_HOST": "cfl.dropboxstatic.com", "NOTES_WEBSERVER": "paper.dropbox.com", "REDIRECT_SAFE_ORIGINS": ["www.dropbox.com", "dropbox.com", "api.dropboxapi.com", "api.dropbox.com", "linux.dropbox.com", "photos.dropbox.com", "carousel.dropbox.com", "client-web.dropbox.com", "services.pp.dropbox.com", "www.dropbox.com", "docsend.com", "paper.dropbox.com", "notes.dropbox.com", "test.composer.dropbox.com", "showcase.dropbox.com", "collections.dropbox.com", "embedded.hellosign.com", "help.dropbox.com", "help-stg.dropbox.com", "experience.dropbox.com", "learn.dropbox.com", "learn-stage.dropbox.com", "app.hellosign.com", "replay.dropbox.com"], "PROF_SHARING_WEBSERVER": "showcase.dropbox.com", "FUNCAPTCHA_SERVER": "dropboxcaptcha.com", "__esModule": true};
//        });
//        define("modules/constants/login_and_register", [], function() {
//            return {"INVISIBLE_RECAPTCHA_SITE_KEY": "6LdnLyIUAAAAAOiGPtddh-g3KiJRoDGGPD-6dqXo", "RECAPTCHA_V3_SITE_KEY": "6LeQblAUAAAAAHIxpoTyzyKHd_2AbdDjSGcyhHSJ", "IS_SELENIUM_TEST": false, "GOOGLE_LOGIN_DESKTOP": "ON_TOP", "APPLE_LOGIN_DESKTOP": "ON", "REDIRECT_WINDOW_TOKEN": "AVIcgvKomYddOpHUvF_uHz61P0tEkbQZlVlfFVgoB9NbmA", "FUNCAPTCHA_PUBLIC_KEY": "419899FA-7FAF-5C1D-C027-BC34963E3A4F", "SHOULD_LOAD_FUNCAPTCHA": true, "FUNCAPTCHA_REGISTER_PUBLIC_KEY": "68CECE5D-F360-8653-CA80-3CF99353DDD2", "FUNCAPTCHA_PAYMENT_PUBLIC_KEY": "8AFFAA35-0217-4EF9-83C8-C62CF9EBCFB3", "__esModule": true};
//        });
//        define("modules/constants/ajax_strings", [], function() {
//            return {"PROBLEM_COMPLETING_REQUEST": "There was a problem completing this request.", "STILL_WORKING": "Still working...", "__esModule": true};
//        });
//        define("modules/constants/locales", [], function() {
//            return {"LIST_OF_LOCALES_WITH_INTERNAL": [{"localeCode": "id", "localeName": "Bahasa Indonesia", "decorator": ""}, {"localeCode": "ms", "localeName": "Bahasa Malaysia", "decorator": ""}, {"localeCode": "da_DK", "localeName": "Dansk", "decorator": ""}, {"localeCode": "de", "localeName": "Deutsch", "decorator": ""}, {"localeCode": "en_GB", "localeName": "English (United Kingdom)", "decorator": ""}, {"localeCode": "en", "localeName": "English (United States)", "decorator": ""}, {"localeCode": "es_ES", "localeName": "Espa\u00f1ol (Espa\u00f1a)", "decorator": ""}, {"localeCode": "es", "localeName": "Espa\u00f1ol (Latinoam\u00e9rica)", "decorator": ""}, {"localeCode": "fr", "localeName": "Fran\u00e7ais", "decorator": ""}, {"localeCode": "it", "localeName": "Italiano", "decorator": ""}, {"localeCode": "nl_NL", "localeName": "Nederlands", "decorator": ""}, {"localeCode": "nb_NO", "localeName": "Norsk (bokm\u00e5l)", "decorator": ""}, {"localeCode": "pl", "localeName": "Polski", "decorator": ""}, {"localeCode": "pt_BR", "localeName": "Portugu\u00eas (Brasil)", "decorator": ""}, {"localeCode": "ru", "localeName": "P\u0443\u0441\u0441\u043a\u0438\u0439", "decorator": ""}, {"localeCode": "sv_SE", "localeName": "Svenska", "decorator": ""}, {"localeCode": "uk_UA", "localeName": "\u0423\u043a\u0440\u0430\u0457\u043d\u0441\u044c\u043a\u0430", "decorator": "Beta"}, {"localeCode": "th_TH", "localeName": "\u0e44\u0e17\u0e22", "decorator": ""}, {"localeCode": "zh_CN", "localeName": "\u4e2d\u6587\uff08\u7b80\u4f53\uff09", "decorator": ""}, {"localeCode": "zh_TW", "localeName": "\u4e2d\u6587\uff08\u7e41\u9ad4\uff09", "decorator": ""}, {"localeCode": "ja", "localeName": "\u65e5\u672c\u8a9e", "decorator": ""}, {"localeCode": "ko", "localeName": "\ud55c\uad6d\uc5b4", "decorator": ""}], "LIST_OF_LOCALES_WITHOUT_INTERNAL": [{"localeCode": "id", "localeName": "Bahasa Indonesia", "decorator": ""}, {"localeCode": "ms", "localeName": "Bahasa Malaysia", "decorator": ""}, {"localeCode": "da_DK", "localeName": "Dansk", "decorator": ""}, {"localeCode": "de", "localeName": "Deutsch", "decorator": ""}, {"localeCode": "en_GB", "localeName": "English (United Kingdom)", "decorator": ""}, {"localeCode": "en", "localeName": "English (United States)", "decorator": ""}, {"localeCode": "es_ES", "localeName": "Espa\u00f1ol (Espa\u00f1a)", "decorator": ""}, {"localeCode": "es", "localeName": "Espa\u00f1ol (Latinoam\u00e9rica)", "decorator": ""}, {"localeCode": "fr", "localeName": "Fran\u00e7ais", "decorator": ""}, {"localeCode": "it", "localeName": "Italiano", "decorator": ""}, {"localeCode": "nl_NL", "localeName": "Nederlands", "decorator": ""}, {"localeCode": "nb_NO", "localeName": "Norsk (bokm\u00e5l)", "decorator": ""}, {"localeCode": "pl", "localeName": "Polski", "decorator": ""}, {"localeCode": "pt_BR", "localeName": "Portugu\u00eas (Brasil)", "decorator": ""}, {"localeCode": "ru", "localeName": "P\u0443\u0441\u0441\u043a\u0438\u0439", "decorator": ""}, {"localeCode": "sv_SE", "localeName": "Svenska", "decorator": ""}, {"localeCode": "uk_UA", "localeName": "\u0423\u043a\u0440\u0430\u0457\u043d\u0441\u044c\u043a\u0430", "decorator": "Beta"}, {"localeCode": "th_TH", "localeName": "\u0e44\u0e17\u0e22", "decorator": ""}, {"localeCode": "zh_CN", "localeName": "\u4e2d\u6587\uff08\u7b80\u4f53\uff09", "decorator": ""}, {"localeCode": "zh_TW", "localeName": "\u4e2d\u6587\uff08\u7e41\u9ad4\uff09", "decorator": ""}, {"localeCode": "ja", "localeName": "\u65e5\u672c\u8a9e", "decorator": ""}, {"localeCode": "ko", "localeName": "\ud55c\uad6d\uc5b4", "decorator": ""}], "__esModule": true};
//        });
//        define("modules/constants/webtiming", [], function() {
//            return {"LOG_TIMING_DELAY": false, "LOG_BROWSER_PERFORMANCE_INFO": true, "LOG_BETA_USER_CENTRIC_PERF_METRICS": false, "__esModule": true};
//        });
//        define("modules/constants/request", [], function() {
//                var o = {"LOGGED_OUT_X_DROPBOX_UID": -1, "IS_HTTP2": true, "PAGE_LOAD_TIME": 1640290187, "REQUEST_ID": "29f40557f1794442871dae8a0ebc60ab", "REQUEST_START_TIME": 1640290187517, "REQUEST_TRACING_ENABLED": false, "__esModule": true};
//                /* global: ensemble is global for maestro pages */
//                if (window.ensemble &amp;&amp; window.ensemble.getRequestId) {
//                    o.REQUEST_ID = ensemble.getRequestId();
//                }
//                return o;
//            });
//            define("modules/constants/page_load", [], function() {
//            return {"COUNTRY_OVERRIDE": null, "PUBLIC_MODE_OVERRIDE": null, "REPO_REV": "d8a46c8374e9ed7481ee591f0646693366096c75", "HOSTNAME": "atlas-identity-live-prod-sjc-6645bfcdcc-dv7dj", "YAPS_DEPLOYMENT": "prod-sjc", "YAPS_PROJECT": "atlasservlet.identity-live", "USER_LOCALE": "en", "SESSION_ID": "220145606692945010317158346017538520628", "IS_SELENIUM_TEST": false, "__esModule": true};
//        });
//        define("modules/constants/viewer", [], function() {
//            return {"DEFAULT_ROOT_NAME": "Dropbox", "PERSONAL_ROLE_STRING": "Personal", "_viewer_properties": {"_user_data": [], "is_team_assume_user_session": false, "is_assume_user_session": false}, "prompt_ha_hiding": true, "LOCALE": "UA", "__esModule": true};
//        });
//        </script>
//    <script type="text/javascript" nonce="fuJJ+lMnDfU+SKy8WPUX">
//            /* global: configureRequire comes from the
//               fake_require_snippet (ui/page/script_tags.py) */
//            configureRequire({"baseUrl": "https://cfl.dropboxstatic.com/static/", "bundles": {"pkg-timing": ["apex-metrics/clock", "apex-metrics/executor", "apex-metrics/index", "apex-metrics/instant", "apex-metrics/internal", "apex-metrics/metrics", "apex-metrics/metrics_reporter", "apex-metrics/no_op", "apex-metrics/types", "apex-metrics/validate", "dropbox/proto/apex_metrics_web/apex_metrics_web", "dropbox/proto/js_init_data/web_timing_logger/web_timing_logger", "modules/clean/js_basic_stopwatch", "modules/clean/js_client_stopwatch", "modules/clean/metrics/apiv2_sink", "modules/clean/metrics/coin", "modules/clean/metrics/database", "modules/clean/metrics/filter", "modules/clean/metrics/index", "modules/clean/metrics/instrumentation", "modules/clean/metrics/serialization", "modules/clean/metrics/server_view_sink", "modules/clean/metrics/unload", "modules/clean/perf_tools/browser_perf_utils", "modules/clean/perf_tools/cpu_utils", "modules/clean/perf_tools/resource_utils", "modules/clean/perf_tools/web_timing_logger_types", "modules/clean/perf_tools/web_timing_utils", "modules/clean/user_centric_perf_metrics/annotations", "modules/clean/user_centric_perf_metrics/in_viewport_mutation_observer", "modules/clean/user_centric_perf_metrics/long_input_delay_observer", "modules/clean/user_centric_perf_metrics/metrics_collector", "modules/clean/user_centric_perf_metrics/metrics_logger", "modules/clean/user_centric_perf_metrics/utils", "modules/clean/user_centric_perf_metrics/visually_complete_calculator", "modules/clean/visibility_logging", "modules/clean/web_module_timing", "modules/clean/web_timing_logger", "modules/clean/window_util", "prod_assets_web_modules/web-vitals"], "pkg-api_v2": ["api_v2/client_base", "api_v2/error", "api_v2/noauth_client", "api_v2/transport/fetch", "api_v2/types", "api_v2/user_client", "modules/clean/active_user", "modules/clean/deprecated_ajax/ajax", "modules/clean/devtools/panels/performance/perf_hub_actions", "modules/clean/flux/dispatcher", "modules/clean/uuid/insecure_uuid", "modules/core/transport/fetch_utils", "modules/core/transport/query_string_helpers", "prod_assets_web_modules/eventemitter3", "prod_assets_web_modules/flux", "prod_assets_web_modules/sjcl"], "pkg-api_v2-extra": ["api_v2/default_user_client", "api_v2/transport/beacon"], "pkg-browse-and-home": ["dig-experimental/rich_snackbar/action", "dig-experimental/rich_snackbar/action_bar", "dig-experimental/rich_snackbar/close_button", "dig-experimental/rich_snackbar/icon", "dig-experimental/rich_snackbar/index", "dig-experimental/rich_snackbar/message", "dig-experimental/rich_snackbar/messages_container", "dig-experimental/rich_snackbar/rich_snackbar", "modules/clean/react/snackbar"], "pkg-privacy-consent": ["dropbox/proto/ccpa_data/ccpa_data", "dropbox/proto/js_init_data/privacy_consent/privacy_consent", "modules/clean/privacy_consent", "modules/clean/privacy_consent/chat_client", "modules/clean/privacy_consent/i18n", "modules/clean/privacy_consent/log", "modules/clean/privacy_consent/marketing_tracker", "modules/clean/privacy_consent/privacy_consent_platform", "modules/clean/privacy_consent/stats"], "pkg-edison": ["dropbox/proto/edison/prefetch/prefetch", "dropbox/proto/edison_dws2/messages", "dropbox/proto/pagelet_prefetch/data_modules/data_modules", "modules/clean/edison/edison", "modules/clean/edison/edison_metrics_logger"], "pkg-core-analytics": ["dropbox/proto/hql_events/extensions", "dropbox/proto/hql_events/taxonomy", "dropbox/proto/hql_events/ux_analytics/ux_analytics_events", "google/protobuf/descriptor", "modules/clean/amp_web_logger", "modules/clean/analytics", "modules/clean/hql/index", "modules/clean/ux_analytics/dispatch_custom_event", "modules/clean/ux_analytics/types", "modules/clean/ux_analytics/ux_analytics"], "pkg-chat": ["dropbox/proto/js_init_data/chat/chat", "modules/clean/chat/chat_client", "modules/clean/chat/chat_client_api", "modules/clean/chat/chat_client_loader", "modules/clean/chat/chat_constants", "modules/clean/chat/chat_identifier", "modules/clean/chat/chat_logger", "modules/clean/chat/chat_logger_api", "modules/clean/chat/chat_logger_factory", "modules/clean/chat/chat_provider_api", "modules/clean/chat/chat_provider_factory", "modules/clean/chat/chat_stone_to_proto", "modules/clean/chat/dialogue/actions/action_types", "modules/clean/chat/dialogue/components/async_dialogue", "modules/clean/chat/dialogue/dialogue_chat_provider", "modules/clean/chat/dialogue/dialogue_stone_proto_transformer", "modules/clean/chat/dialogue/experiments", "modules/clean/chat/snapengage_chat_instance_handler", "modules/clean/chat/snapengage_chat_instance_handler_api", "modules/clean/chat/snapengage_chat_provider", "modules/clean/chat/snapengage_tags", "modules/clean/logging/hive/schemas/megaphone-events"], "pkg-legacy-ab": ["dropbox/proto/js_init_data/marketing_tracker/marketing_tracker", "google/protobuf/struct", "modules/clean/legacy_ui_button", "modules/clean/marketing_tracker"], "pkg-protobufjs": ["google/protobuf/any", "google/protobuf/empty", "google/protobuf/timestamp", "prod_assets_web_modules/protobufjs/minimal", "proto_utils/unpack"], "pkg-captcha": ["modules/clean/abuse/captcha_helper"], "pkg-login-pages-externals": ["modules/clean/abuse/funcaptcha_modal", "modules/clean/auth/authenticator", "modules/clean/auth/u2f", "modules/clean/auth/webauthn", "modules/clean/react/fedramp/fedramp_util", "modules/clean/web_register_logging_data", "prod_assets_web_modules/u2f-api"], "pkg-login-and-register-pages": ["modules/clean/auth/common/captcha", "modules/clean/auth/common/error", "modules/clean/auth/common/inputs/checkbox", "modules/clean/auth/common/inputs/text", "modules/clean/auth/common/stats", "modules/clean/auth/common/types", "modules/clean/auth/common/utils", "modules/clean/auth/login/2fa/authenticator_form", "modules/clean/auth/login/2fa/email_form", "modules/clean/auth/login/2fa/phone_form", "modules/clean/auth/login/2fa/seckey_form", "modules/clean/auth/login/2fa/trust_checkbox", "modules/clean/auth/login/api", "modules/clean/auth/login/apple_login_button", "modules/clean/auth/login/credentials_form", "modules/clean/auth/login/form", "modules/clean/auth/login/google_login_button", "modules/clean/auth/login/login_error", "modules/clean/auth/login/sso_utils", "modules/clean/auth/login/types", "modules/clean/auth/login_or_register/logging_util", "modules/clean/auth/login_or_register/login_register_container", "modules/clean/auth/register/form", "modules/clean/auth/register/google_register_button", "modules/clean/auth/register/name_fields", "modules/clean/auth/register/types", "modules/clean/auth/register/view", "modules/clean/components/password_strength_meter", "modules/clean/form_util/name_parser"], "pkg-file_viewer": ["modules/clean/auth/login_or_register/types"], "pkg-login-pages": ["modules/clean/auth_event_logger", "modules/clean/viewer_refresh"], "pkg-coreui-with-i18n": ["modules/clean/cookie_check"], "pkg-exception-reporting": ["modules/clean/csrf", "modules/core/assert", "modules/core/cookies", "modules/core/exception", "modules/core/exception_tag_registry", "modules/core/xhr", "modules/shims/tracekit", "prod_assets_web_modules/tracekit"], "pkg-core-url-and-css": ["modules/clean/css", "modules/clean/css_cache", "modules/clean/static_urls", "modules/core/uri"], "pkg-core": ["modules/clean/dbmodal_stack", "modules/clean/deprecated_ajax/ajax_jquery", "modules/clean/deprecated_ajax/job_progress", "modules/clean/devtools/panels/performance/perf_hub_action_types", "modules/clean/event_load", "modules/clean/ts_utils", "modules/clean/user", "modules/clean/ux_analytics/utils", "modules/clean/viewer", "modules/core/accessible_announce", "modules/core/browser", "modules/core/browser_detection", "modules/core/dom", "modules/core/html", "modules/core/notify", "modules/core/persistence/storage", "prod_assets_web_modules/ts-key-enum", "prod_assets_web_modules/ts-keycode-enum"], "pkg-modules-unneeded-for-home": ["modules/clean/deprecated_ajax/ajax_as_promised_jquery", "modules/clean/flux/base_store", "modules/clean/react/bubble_dropdown_v2", "modules/clean/react/tooltip"], "pkg-sharing-confirmation-modals": ["modules/clean/flux/store_listener"], "pkg-coreui": ["modules/clean/init_react", "modules/clean/raf_throttle", "modules/clean/react/components/css", "modules/clean/react/components/document", "modules/clean/react/components/helpers", "modules/clean/react/components/portal", "modules/clean/react/free_positioned", "modules/clean/react/image", "modules/clean/react/overlay", "modules/clean/react/sprite", "modules/clean/react/sprite_div", "modules/clean/react/sticky_position", "modules/clean/redux/devtools", "modules/clean/redux/unsupported", "prod_assets_web_modules/hoist-non-react-statics", "prod_assets_web_modules/react-redux", "prod_assets_web_modules/redux", "prod_assets_web_modules/redux-thunk"], "pkg-locale-selector": ["modules/clean/intl_router_utils", "modules/clean/react/locale_selector"], "pkg-telemetry": ["modules/clean/logging/compression", "modules/clean/logging/sender", "modules/clean/logging/storage", "modules/clean/logging/telemetry"], "pkg-ncct": ["modules/clean/ncct/manual_assist_util"], "pkg-profile_services": ["modules/clean/profile_services/auth_callback_handler", "modules/clean/profile_services/popup_handler", "modules/clean/profile_services/profile_services_constants", "modules/clean/profile_services/profile_services_link"], "pkg-i18n": ["modules/clean/react/components/modal_controller", "modules/core/i18n", "prod_assets_web_modules/react-intl"], "pkg-coreui-forms": ["modules/clean/react/form_error_mixin", "modules/clean/react/input"], "pkg-legacy-dig-migration": ["modules/clean/react/input_dig", "modules/clean/react/modal_dig"], "pkg-core-security": ["modules/clean/security/crypto", "modules/clean/security/passwords", "modules/clean/security/util"], "pkg-growth_features": ["modules/clean/server_side_client_view_bridge"], "pkg-stormcrow": ["modules/clean/stormcrow/stormcrow_exposure_logger"], "pkg-loadable": ["modules/core/cancelable_promise"], "pkg-dig-b": ["prod_assets_web_modules/@popperjs/core", "prod_assets_web_modules/dig-components/click_outside", "prod_assets_web_modules/dig-components/hooks", "prod_assets_web_modules/dig-components/layer", "prod_assets_web_modules/dig-components/menu", "prod_assets_web_modules/dig-components/motion", "prod_assets_web_modules/dig-components/overlay", "prod_assets_web_modules/dig-components/tooltips"], "pkg-external": ["prod_assets_web_modules/classnames", "prod_assets_web_modules/common/_commonjsHelpers", "prod_assets_web_modules/common/zipWith", "prod_assets_web_modules/dompurify", "prod_assets_web_modules/lodash", "prod_assets_web_modules/tslib"], "pkg-dig-vendor": ["prod_assets_web_modules/common/Transition", "prod_assets_web_modules/common/TransitionGroup", "prod_assets_web_modules/common/extends", "prod_assets_web_modules/focus-visible", "prod_assets_web_modules/react-transition-group/CSSTransition", "prod_assets_web_modules/resize-observer-polyfill"], "pkg-externals-unneeded-for-home": ["prod_assets_web_modules/common/__node-resolve_empty"], "pkg-react-libs": ["prod_assets_web_modules/common/index", "prod_assets_web_modules/create-react-class", "prod_assets_web_modules/prop-types"], "pkg-dig-a": ["prod_assets_web_modules/dig-components/avatar", "prod_assets_web_modules/dig-components/banner", "prod_assets_web_modules/dig-components/controls", "prod_assets_web_modules/dig-components/modal", "prod_assets_web_modules/dig-components/snackbar", "prod_assets_web_modules/dig-components/text_fields"], "pkg-dig-d": ["prod_assets_web_modules/dig-components/buttons", "prod_assets_web_modules/dig-components/progress_indicators", "prod_assets_web_modules/dig-components/typography"], "pkg-dig-icons": ["prod_assets_web_modules/dig-components/icons", "prod_assets_web_modules/dig-components/icons/src"], "pkg-react": ["prod_assets_web_modules/react", "prod_assets_web_modules/react-dom"], "pkg-mcl-modal": ["prod_assets_web_modules/react-modal"], "pkg-embedded_app": ["prod_assets_web_modules/react-transition-group"], "pkg-spectrum-arbor": ["spectrum-arbor/atoms/arbor_box/index", "spectrum-arbor/atoms/arbor_link/index", "spectrum-arbor/constants/master_constants", "spectrum-arbor/types/index", "spectrum-arbor/util/breakpoint_class_generator", "spectrum-arbor/util/color_contrast_helpers", "spectrum-arbor/util/colorutils", "spectrum-arbor/util/devices", "spectrum-arbor/util/display_name_helper", "spectrum-arbor/util/prop_helpers", "spectrum-arbor/util/theme"], "pkg-mcl-snackbar": ["spectrum/button/button", "spectrum/button/index", "spectrum/progress_bar/index", "spectrum/progress_bar/progress_bar", "spectrum/snackbar/index", "spectrum/snackbar/snackbar"], "pkg-mcl-icons": ["spectrum/icon_status/bundle", "spectrum/icon_status/index", "spectrum/icon_templates/status/index"], "pkg-mcl-home": ["spectrum/icon_templates/css_utils", "spectrum/svg_icon_bundle/index", "spectrum/svg_icon_bundle/svg_icon_bundle"]}, "map": {"*": {"modules/reactserver_stubs/__unstubbed_purify": "prod_assets_web_modules/dompurify", "modules/core/langpack": "json_loader!js/langpack/icu-en.json", "tslib": "prod_assets_web_modules/tslib", "protobufjs/minimal": "prod_assets_web_modules/protobufjs/minimal", "jquery": "prod_assets_web_modules/jquery", "lodash-es": "prod_assets_web_modules/lodash-es", "lodash": "prod_assets_web_modules/lodash", "ts-key-enum": "prod_assets_web_modules/ts-key-enum", "react": "prod_assets_web_modules/react", "tracekit": "prod_assets_web_modules/tracekit", "eventemitter3": "prod_assets_web_modules/eventemitter3", "react-dom": "prod_assets_web_modules/react-dom", "react-dom/server": "prod_assets_web_modules/react-dom/server", "react-dom/test-utils": "prod_assets_web_modules/react-dom/test-utils", "dompurify": "prod_assets_web_modules/dompurify", "sjcl": "prod_assets_web_modules/sjcl", "node-forge": "prod_assets_web_modules/node-forge", "react-intl": "prod_assets_web_modules/react-intl", "flux": "prod_assets_web_modules/flux", "redux": "prod_assets_web_modules/redux", "keymaster": "prod_assets_web_modules/keymaster", "classnames": "prod_assets_web_modules/classnames", "immutable": "prod_assets_web_modules/immutable", "prop-types": "prod_assets_web_modules/prop-types", "create-react-class": "prod_assets_web_modules/create-react-class", "date-fns": "prod_assets_web_modules/date-fns", "@datepicker-react/hooks": "prod_assets_web_modules/@datepicker-react/hooks", "@popperjs/core": "prod_assets_web_modules/@popperjs/core", "focus-visible": "prod_assets_web_modules/focus-visible", "grapheme-splitter": "prod_assets_web_modules/grapheme-splitter", "react-modal": "prod_assets_web_modules/react-modal", "react-transition-group": "prod_assets_web_modules/react-transition-group", "react-transition-group/CSSTransition": "prod_assets_web_modules/react-transition-group/CSSTransition", "resize-observer-polyfill": "prod_assets_web_modules/resize-observer-polyfill", "dig-components": "prod_assets_web_modules/dig-components", "dig-components/avatar": "prod_assets_web_modules/dig-components/avatar", "dig-components/badges": "prod_assets_web_modules/dig-components/badges", "dig-components/banner": "prod_assets_web_modules/dig-components/banner", "dig-components/buttons": "prod_assets_web_modules/dig-components/buttons", "dig-components/breadcrumb": "prod_assets_web_modules/dig-components/breadcrumb", "dig-components/carousel": "prod_assets_web_modules/dig-components/carousel", "dig-components/chips": "prod_assets_web_modules/dig-components/chips", "dig-components/click_outside": "prod_assets_web_modules/dig-components/click_outside", "dig-components/combinations": "prod_assets_web_modules/dig-components/combinations", "dig-components/controls": "prod_assets_web_modules/dig-components/controls", "dig-components/datepicker": "prod_assets_web_modules/dig-components/datepicker", "dig-components/dropzone": "prod_assets_web_modules/dig-components/dropzone", "dig-components/global_header": "prod_assets_web_modules/dig-components/global_header", "dig-components/hooks": "prod_assets_web_modules/dig-components/hooks", "dig-components/icons": "prod_assets_web_modules/dig-components/icons", "dig-components/icons/src": "prod_assets_web_modules/dig-components/icons/src", "dig-components/layer": "prod_assets_web_modules/dig-components/layer", "dig-components/logos": "prod_assets_web_modules/dig-components/logos", "dig-components/menu": "prod_assets_web_modules/dig-components/menu", "dig-components/modal": "prod_assets_web_modules/dig-components/modal", "dig-components/motion": "prod_assets_web_modules/dig-components/motion", "dig-components/overlay": "prod_assets_web_modules/dig-components/overlay", "dig-components/progress_indicators": "prod_assets_web_modules/dig-components/progress_indicators", "dig-components/snackbar": "prod_assets_web_modules/dig-components/snackbar", "dig-components/tabs": "prod_assets_web_modules/dig-components/tabs", "dig-components/text_fields": "prod_assets_web_modules/dig-components/text_fields", "dig-components/tooltips": "prod_assets_web_modules/dig-components/tooltips", "dig-components/truncate": "prod_assets_web_modules/dig-components/truncate", "dig-components/typeahead": "prod_assets_web_modules/dig-components/typeahead", "dig-components/typography": "prod_assets_web_modules/dig-components/typography", "dig-components/jest_after_env_setup": "prod_assets_web_modules/dig-components/jest_after_env_setup", "ts-keycode-enum": "prod_assets_web_modules/ts-keycode-enum", "zxcvbn": "prod_assets_web_modules/zxcvbn", "hoist-non-react-statics": "prod_assets_web_modules/hoist-non-react-statics", "web-vitals": "prod_assets_web_modules/web-vitals", "exenv": "prod_assets_web_modules/exenv", "focus-trap-react": "prod_assets_web_modules/focus-trap-react", "react-aria-menubutton": "prod_assets_web_modules/react-aria-menubutton", "react-aria-tabpanel": "prod_assets_web_modules/react-aria-tabpanel", "react-day-picker": "prod_assets_web_modules/react-day-picker", "react-day-picker/DayPickerInput": "prod_assets_web_modules/react-day-picker/DayPickerInput", "react-touch-events": "prod_assets_web_modules/react-touch-events", "draft-js": "prod_assets_web_modules/draft-js", "punycode-web": "prod_assets_web_modules/punycode-web", "m3u8-parser": "prod_assets_web_modules/m3u8-parser", "react-onclickoutside": "prod_assets_web_modules/react-onclickoutside", "react-redux": "prod_assets_web_modules/react-redux", "reselect": "prod_assets_web_modules/reselect", "videojs": "prod_assets_web_modules/videojs", "react-table": "prod_assets_web_modules/react-table", "highcharts": "prod_assets_web_modules/highcharts", "highcharts/highcharts-more": "prod_assets_web_modules/highcharts/highcharts-more", "highcharts/modules/solid-gauge": "prod_assets_web_modules/highcharts/modules/solid-gauge", "highcharts-react-official": "prod_assets_web_modules/highcharts-react-official", "jquery_payment": "prod_assets_web_modules/jquery_payment", "u2f-api": "prod_assets_web_modules/u2f-api", "deep-freeze": "prod_assets_web_modules/deep-freeze", "history-v4": "prod_assets_web_modules/history-v4", "react-router": "prod_assets_web_modules/react-router", "react-router-dom": "prod_assets_web_modules/react-router-dom", "fabric": "prod_assets_web_modules/fabric", "d3": "prod_assets_web_modules/d3", "lunr": "prod_assets_web_modules/lunr", "bloodhound": "prod_assets_web_modules/bloodhound", "mOxie": "prod_assets_web_modules/mOxie", "plupload_dev": "prod_assets_web_modules/plupload_dev", "lru": "prod_assets_web_modules/lru", "axe-core": "prod_assets_web_modules/axe-core", "axs_testing": "prod_assets_web_modules/axs_testing", "react-virtualized-auto-sizer": "prod_assets_web_modules/react-virtualized-auto-sizer", "react-window": "prod_assets_web_modules/react-window", "redux-thunk": "prod_assets_web_modules/redux-thunk", "styled-components": "prod_assets_web_modules/styled-components", "react-addons-pure-render-mixin": "prod_assets_web_modules/react-addons-pure-render-mixin", "nouislider": "prod_assets_web_modules/nouislider", "react-addons-update": "prod_assets_web_modules/react-addons-update", "reduce-reducers": "prod_assets_web_modules/reduce-reducers", "redux-actions": "prod_assets_web_modules/redux-actions", "redux-saga": "prod_assets_web_modules/redux-saga", "redux-saga/effects": "prod_assets_web_modules/redux-saga/effects", "react-async-component": "prod_assets_web_modules/react-async-component", "react-error-boundary": "prod_assets_web_modules/react-error-boundary", "@apollo/react-common": "prod_assets_web_modules/@apollo/react-common", "@apollo/react-components": "prod_assets_web_modules/@apollo/react-components", "apollo-link": "prod_assets_web_modules/apollo-link", "@apollo/react-hooks": "prod_assets_web_modules/@apollo/react-hooks", "dataloader": "prod_assets_web_modules/dataloader", "graphql-tag": "prod_assets_web_modules/graphql-tag", "apollo-client": "prod_assets_web_modules/apollo-client", "graphql": "prod_assets_web_modules/graphql", "adyen-checkout": "prod_assets_web_modules/adyen-checkout", "jsqr": "prod_assets_web_modules/jsqr", "@wry/context": "prod_assets_web_modules/@wry/context", "apollo-cache-inmemory": "prod_assets_web_modules/apollo-cache-inmemory", "jquery.qrcode": "prod_assets_web_modules/jquery.qrcode", "phone_helpers": "prod_assets_web_modules/phone_helpers", "history": "prod_assets_web_modules/history", "react-router-v3": "prod_assets_web_modules/react-router-v3", "react-beautiful-dnd": "prod_assets_web_modules/react-beautiful-dnd", "@reduxjs/toolkit": "prod_assets_web_modules/@reduxjs/toolkit", "bootstrap-3.2": "prod_assets_web_modules/bootstrap-3.2", "react-dom-factories": "prod_assets_web_modules/react-dom-factories", "@material-ui/core": "prod_assets_web_modules/@material-ui/core", "@material-ui/icons": "prod_assets_web_modules/@material-ui/icons", "final-form": "prod_assets_web_modules/final-form", "performance-bookmarklet": "prod_assets_web_modules/performance-bookmarklet", "react-final-form": "prod_assets_web_modules/react-final-form", "react-masonry-component": "prod_assets_web_modules/react-masonry-component", "react-use": "prod_assets_web_modules/react-use", "react-select-2": "prod_assets_web_modules/react-select-2", "react-select-2/lib/Async": "prod_assets_web_modules/react-select-2/lib/Async", "jquery-scrollNav": "prod_assets_web_modules/jquery-scrollNav", "apollo-cache": "prod_assets_web_modules/apollo-cache", "react-schemaorg": "prod_assets_web_modules/react-schemaorg", "schema-dts": "prod_assets_web_modules/schema-dts", "showdown": "prod_assets_web_modules/showdown", "dropbox-internal-sdk": "prod_assets_web_modules/dropbox-internal-sdk", "braintree-web": "prod_assets_web_modules/braintree-web", "paypal-api-checkout": "prod_assets_web_modules/paypal-api-checkout", "prototype": "prod_assets_web_modules/prototype", "scriptaculous": "prod_assets_web_modules/scriptaculous", "videojs-contrib-quality-levels": "prod_assets_web_modules/videojs-contrib-quality-levels", "trello-power-up": "prod_assets_web_modules/trello-power-up", "sorttable": "prod_assets_web_modules/sorttable", "react-next": "prod_assets_web_modules/react-next", "react-dom-next": "prod_assets_web_modules/react-dom-next", "react-dom-next/server": "prod_assets_web_modules/react-dom-next/server", "react-dom-next/test-utils": "prod_assets_web_modules/react-dom-next/test-utils"}}, "nodeIdCompat": true, "paths": {"pkg-timing": "js/packaged/pkg-timing.min-vfljGFSia", "pkg-api_v2": "js/packaged/pkg-api_v2.min-vflWM-q2v", "pkg-api_v2-extra": "js/packaged/pkg-api_v2-extra.min-vflziRKXR", "pkg-browse-and-home": "js/packaged/pkg-browse-and-home.min-vflrmIdpY", "dig-illustrations/spot/key-card": "js/dig-illustrations/spot/key-card.amd.min-vflJSWFCE", "dig-illustrations/spot/seat-empty": "js/dig-illustrations/spot/seat-empty.amd.min-vflqCtHUA", "pkg-privacy-consent": "js/packaged/pkg-privacy-consent.min-vflzZJAtO", "pkg-edison": "js/packaged/pkg-edison.min-vflu_tH58", "pkg-core-analytics": "js/packaged/pkg-core-analytics.min-vfl861I9d", "pkg-chat": "js/packaged/pkg-chat.min-vflLjgVSz", "pkg-legacy-ab": "js/packaged/pkg-legacy-ab.min-vflVibodp", "pkg-protobufjs": "js/packaged/pkg-protobufjs.min-vflrkiHyB", "pkg-captcha": "js/packaged/pkg-captcha.min-vflEeDrPW", "pkg-login-pages-externals": "js/packaged/pkg-login-pages-externals.min-vfl4v1lxI", "modules/clean/accessibility/tabbable": "js/modules/clean/accessibility/tabbable.min-vflfwdsoD", "pkg-login-and-register-pages": "js/packaged/pkg-login-and-register-pages.min-vfly9v1OB", "modules/clean/auth/login_or_register/login_register_page": "js/modules/clean/auth/login_or_register/login_register_page.min-vflm0B6Yg", "pkg-file_viewer": "js/packaged/pkg-file_viewer.min-vflk8ETx_", "pkg-login-pages": "js/packaged/pkg-login-pages.min-vflOSczLQ", "modules/clean/chat/dialogue/actions/addon_actions": "js/modules/clean/chat/dialogue/actions/addon_actions.min-vflkFUYNC", "modules/clean/chat/dialogue/actions/chat_actions": "js/modules/clean/chat/dialogue/actions/chat_actions.min-vfleuALZX", "modules/clean/chat/dialogue/actions/dialogue_client": "js/modules/clean/chat/dialogue/actions/dialogue_client.min-vflMiCMMm", "modules/clean/chat/dialogue/actions/gromit_actions": "js/modules/clean/chat/dialogue/actions/gromit_actions.min-vflu1bmsg", "modules/clean/chat/dialogue/actions/link_actions": "js/modules/clean/chat/dialogue/actions/link_actions.min-vflIuDRW1", "modules/clean/chat/dialogue/actions/message_actions": "js/modules/clean/chat/dialogue/actions/message_actions.min-vfl5ozAw8", "modules/clean/chat/dialogue/actions/provider_actions": "js/modules/clean/chat/dialogue/actions/provider_actions.min-vfl61X2Cw", "modules/clean/chat/dialogue/actions/survey_actions": "js/modules/clean/chat/dialogue/actions/survey_actions.min-vflIA5YdL", "modules/clean/chat/dialogue/components/body": "js/modules/clean/chat/dialogue/components/body.min-vfl3ipfe-", "modules/clean/chat/dialogue/components/button": "js/modules/clean/chat/dialogue/components/button.min-vflSabSvb", "modules/clean/chat/dialogue/components/confirm_password_modal": "js/modules/clean/chat/dialogue/components/confirm_password_modal.min-vflwZi-jb", "modules/clean/chat/dialogue/components/dialogue_chat": "js/modules/clean/chat/dialogue/components/dialogue_chat.min-vflqWtToJ", "modules/clean/chat/dialogue/components/end_chat_modal": "js/modules/clean/chat/dialogue/components/end_chat_modal.min-vflsl3Wz4", "modules/clean/chat/dialogue/components/gromit": "js/modules/clean/chat/dialogue/components/gromit.min-vfl0aFrfT", "modules/clean/chat/dialogue/components/header": "js/modules/clean/chat/dialogue/components/header.min-vflidS8Sd", "modules/clean/chat/dialogue/components/input": "js/modules/clean/chat/dialogue/components/input.min-vflUW6ZaQ", "modules/clean/chat/dialogue/components/link": "js/modules/clean/chat/dialogue/components/link.min-vfl858tXL", "modules/clean/chat/dialogue/components/message": "js/modules/clean/chat/dialogue/components/message.min-vflHyHAQY", "modules/clean/chat/dialogue/components/message_group": "js/modules/clean/chat/dialogue/components/message_group.min-vflQJeK4v", "modules/clean/chat/dialogue/components/minimized": "js/modules/clean/chat/dialogue/components/minimized.min-vfl3IBc1B", "modules/clean/chat/dialogue/components/prompt_modal": "js/modules/clean/chat/dialogue/components/prompt_modal.min-vfl9n82hd", "modules/clean/chat/dialogue/components/survey/comment_field": "js/modules/clean/chat/dialogue/components/survey/comment_field.min-vflIgD5oQ", "modules/clean/chat/dialogue/components/survey/csat_question": "js/modules/clean/chat/dialogue/components/survey/csat_question.min-vflqO_bCd", "modules/clean/chat/dialogue/components/survey/index": "js/modules/clean/chat/dialogue/components/survey/index.min-vflyQsQyt", "modules/clean/chat/dialogue/components/survey/question": "js/modules/clean/chat/dialogue/components/survey/question.min-vflWXidst", "modules/clean/chat/dialogue/components/typing_indicator": "js/modules/clean/chat/dialogue/components/typing_indicator.min-vflGqKnPo", "modules/clean/chat/dialogue/components/widgets/confirm_password_widget": "js/modules/clean/chat/dialogue/components/widgets/confirm_password_widget.min-vflkz-3Xk", "modules/clean/chat/dialogue/components/widgets/confirm_yes_no_widget": "js/modules/clean/chat/dialogue/components/widgets/confirm_yes_no_widget.min-vfl9VWquZ", "modules/clean/chat/dialogue/components/widgets/index": "js/modules/clean/chat/dialogue/components/widgets/index.min-vflgcQbDv", "modules/clean/chat/dialogue/dialogue": "js/modules/clean/chat/dialogue/dialogue.min-vflWOHZFy", "modules/clean/chat/dialogue/hooks": "js/modules/clean/chat/dialogue/hooks.min-vflbrZBFB", "modules/clean/chat/dialogue/logging": "js/modules/clean/chat/dialogue/logging.min-vflKYN98A", "modules/clean/chat/dialogue/middleware/chat_provider": "js/modules/clean/chat/dialogue/middleware/chat_provider.min-vflZ-B9ms", "modules/clean/chat/dialogue/reducers/addon_state": "js/modules/clean/chat/dialogue/reducers/addon_state.min-vflWDoyuq", "modules/clean/chat/dialogue/reducers/chat_state": "js/modules/clean/chat/dialogue/reducers/chat_state.min-vflnpWS87", "modules/clean/chat/dialogue/reducers/index": "js/modules/clean/chat/dialogue/reducers/index.min-vflcwgYJ0", "modules/clean/chat/dialogue/reducers/provider_state": "js/modules/clean/chat/dialogue/reducers/provider_state.min-vfljQUFbW", "modules/clean/chat/dialogue/store/index": "js/modules/clean/chat/dialogue/store/index.min-vflXGUt-b", "modules/clean/chat/dialogue/util": "js/modules/clean/chat/dialogue/util.min-vfl_NkAZV", "pkg-coreui-with-i18n": "js/packaged/pkg-coreui-with-i18n.min-vflaEtaCb", "pkg-exception-reporting": "js/packaged/pkg-exception-reporting.min-vflzTq0Dy", "pkg-core-url-and-css": "js/packaged/pkg-core-url-and-css.min-vfl3vdTmO", "pkg-core": "js/packaged/pkg-core.min-vflCL1p6K", "pkg-modules-unneeded-for-home": "js/packaged/pkg-modules-unneeded-for-home.min-vfl92vce0", "pkg-sharing-confirmation-modals": "js/packaged/pkg-sharing-confirmation-modals.min-vfl8-BkJV", "pkg-coreui": "js/packaged/pkg-coreui.min-vflmU6tLz", "pkg-locale-selector": "js/packaged/pkg-locale-selector.min-vflMtcK1O", "pkg-telemetry": "js/packaged/pkg-telemetry.min-vflLhBg4T", "modules/clean/logging/hive/schemas/web-dialogue_events": "js/modules/clean/logging/hive/schemas/web-dialogue_events.min-vfl_Pt23b", "pkg-ncct": "js/packaged/pkg-ncct.min-vflmpOJ1I", "modules/clean/privacy_consent/consent_iframe_wrapper": "js/modules/clean/privacy_consent/consent_iframe_wrapper.min-vflZt1htm", "modules/clean/privacy_consent/privacy_consent_cookies": "js/modules/clean/privacy_consent/privacy_consent_cookies.min-vflKivLTo", "pkg-profile_services": "js/packaged/pkg-profile_services.min-vfl8ZvheY", "pkg-i18n": "js/packaged/pkg-i18n.min-vfloDjduH", "pkg-coreui-forms": "js/packaged/pkg-coreui-forms.min-vflZHlpXq", "pkg-legacy-dig-migration": "js/packaged/pkg-legacy-dig-migration.min-vflw7bGqi", "pkg-core-security": "js/packaged/pkg-core-security.min-vflhHxXWZ", "modules/clean/security/csrf_hmac": "js/modules/clean/security/csrf_hmac.min-vflQuGsTR", "modules/clean/security/legacy_edge_shim": "js/modules/clean/security/legacy_edge_shim.min-vflqJVWVg", "modules/clean/security/webkitcrypto_shim": "js/modules/clean/security/webkitcrypto_shim.min-vfl_AQvrG", "pkg-growth_features": "js/packaged/pkg-growth_features.min-vflecT4EG", "pkg-stormcrow": "js/packaged/pkg-stormcrow.min-vflQGbRgL", "modules/clean/ux_analytics/lazy_ux_analytics": "js/modules/clean/ux_analytics/lazy_ux_analytics.min-vflUnRRc7", "modules/clean/ux_analytics/ux_variants": "js/modules/clean/ux_analytics/ux_variants.min-vflEEZXJo", "modules/clean/ux_analytics/window_history_listeners": "js/modules/clean/ux_analytics/window_history_listeners.min-vflSSI8x4", "pkg-loadable": "js/packaged/pkg-loadable.min-vflHXk73V", "modules/core/toast/toast_on_init": "js/modules/core/toast/toast_on_init.min-vflwuF2Ek", "pkg-dig-b": "js/packaged/pkg-dig-b.min-vflG7Rrly", "pkg-external": "js/packaged/pkg-external.min-vflfrssyC", "pkg-dig-vendor": "js/packaged/pkg-dig-vendor.min-vflz-YJG0", "pkg-externals-unneeded-for-home": "js/packaged/pkg-externals-unneeded-for-home.min-vflho-9qu", "pkg-react-libs": "js/packaged/pkg-react-libs.min-vflVZaerq", "pkg-dig-a": "js/packaged/pkg-dig-a.min-vflJCC538", "pkg-dig-d": "js/packaged/pkg-dig-d.min-vflzCcqpZ", "pkg-dig-icons": "js/packaged/pkg-dig-icons.min-vfloZm63x", "prod_assets_web_modules/jquery": "js/prod_assets_web_modules/jquery-vflYfRgmF", "prod_assets_web_modules/node-forge": "js/prod_assets_web_modules/node-forge-vflVpY-6T", "pkg-react": "js/packaged/pkg-react.min-vfl-NUsTB", "pkg-mcl-modal": "js/packaged/pkg-mcl-modal.min-vflJEz0Su", "pkg-embedded_app": "js/packaged/pkg-embedded_app.min-vflXFfK0e", "prod_assets_web_modules/zxcvbn": "js/prod_assets_web_modules/zxcvbn-vfl0nBBdG", "pkg-spectrum-arbor": "js/packaged/pkg-spectrum-arbor.min-vflLfGgZc", "pkg-mcl-snackbar": "js/packaged/pkg-mcl-snackbar.min-vflf4qmdA", "pkg-mcl-icons": "js/packaged/pkg-mcl-icons.min-vflwKyAWK", "pkg-mcl-home": "js/packaged/pkg-mcl-home.min-vflJt797z", "js/langpack/icu-en.json": "js/langpack/icu-en.json?18984"}, "shim": {}, "waitSeconds": 30}, {"deferJs": false, "exceptionModule": "modules/core/exception", "requireFallbackBaseUrl": "https://www.dropboxstatic.com/static/", "reusingContext": false}, [[[["modules/clean/accessibility/tabbable"], (function(mod){
//var init = mod.initialize_module; if (init != null){init();};
//}), "require-tier-require-and-configure-modules/clean/accessibility/tabbable"],[["modules/clean/analytics", "modules/clean/ux_analytics/ux_analytics", "modules/core/exception"], (function(analytics,uxanalytics,JSException){
//
//        function errReporter (err) {
//          JSException.reportException({
//            err: err,
//            severity: JSException.SEVERITY.CRITICAL,
//            tags: ["ux_analytics"],
//          });
//        }
//        uxanalytics.UXAnalytics.initialize(analytics.UXAnalyticsLogger, {"requestId": "29f40557f1794442871dae8a0ebc60ab", "orgReferrer": "", "httpReferrer": "", "previousUrl": "", "visitId": "", "event_names": ["link_click", "email_signup_start", "final_heartbeat", "modal_open", "admin_home_client_banner_dismissed", "shown_banner_signin_ep", "email_signup_failed", "redirect_to_dropbox_smode_store_page", "signup_modal_dismissed", "script_url", "spa_source", "google_login_failed", "email_login_redirect", "google_login_start", "login_modal_shown", "script_id", "sia_login_requires_two_factor", "scroll_event", "admin_home_client_banner_shown", "tl_template_redirect", "tl_page_view", "click_banner_signin_ep", "google_signup_failed", "signup_modal_shown", "heartbeat", "google_login_requires_two_factor", "email_login_failed", "redirect_success", "email_login_succeeded", "sia_login_failed", "link_no_session_storage", "adobe_target_variants", "sia_login_start", "sia_login_succeeded", "modal_close", "email_split_signup_continue", "scan_success", "google_signup_start", "google_login_succeeded", "click_tooltip_signin_ep", "google_signup_succeeded", "element_click", "page_view", "instance_init_ts", "login_modal_dismissed", "email_signup_succeeded", "dropbox_download", "shown_tooltip_signin_ep", "iframe_uri", "admin_home_client_banner_clicked", "ux-analytics", "sia_login_requires_password", "dropbox_restart_download", "email_login_start", "instance_event_count", "email_login_requires_two_factor"]}, errReporter);
//        ;
//}), ""],[["modules/clean/chat/chat_client_loader"], (function(mod){
//mod.initialize_module({"userId": null, "url": "https://www.dropbox.com/login?cont=https%3A%2F%2Fwww.dropbox.com%2Fhome", "bypassWaitForTTI": null});
//}), "require-tier-require-and-configure-modules/clean/chat/chat_client_loader"],[["modules/clean/cookie_check"], (function(mod){
//var init = mod.initialize_module; if (init != null){init();};
//}), "require-tier-require-and-configure-modules/clean/cookie_check"],[["modules/clean/auth/login_or_register/login_register_page", "modules/clean/init_react"], (function(mod,InitReact){
//InitReact.mountComponent(mod, {"module_name": "modules/clean/auth/login_or_register/login_register_page", "component_name": "LoginRegisterPage", "elem_id": "component3890191328821095615", "props": {"shouldDefaultToRegister": false, "showMarketingOptIn": false, "showNaviSiteLoginForJPLocale": false, "encryptionOptions": {"key": "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4QceIUbBKmuxVA342hEs0rIn7YXfiUukAhzU4Z8nHvjKALxWkyVW8zojOj8xDc28sNrXvBskPXtUVahIF8ii3UML-U7i5XRCEDi_aCyyrVxfOJlKWi9Pn_GproYm4qN7aVkcmt2bjjQZjomA5VZlusmeQ2hPVF5CgvEWELv5IHvDKkmUzpmL8z5vopkl_d46Uc_mX_71P8v3GbcPl5EmnQnVnJqpuJ_f27hH8T_d3ZNyFRMiLCQeadhveSjS4lkHRklT6mJhM6TGby2V8m_anVpcW5D4oHLjeVXcow4vPLoqMCLudrbuU9VkiPm2qgb6gNQUYTQSfSHRSZGHWCCDEwIDAQAB", "version": 0, "type": "RSA-OAEP", "timestamp": 1640290187.5330076}, "emailFill": null, "loginCont": "https://www.dropbox.com/home", "registerCont": null, "registerFirstName": null, "registerLastName": null, "signupTag": "login_page", "signupData": null, "signupEndpoint": "login", "showPasswordsVariant": "BANNER_ENTRY_POINT_V1"}});
//}), "require-tier-init_react_modules/clean/auth/login_or_register/login_register_page-LoginRegisterPage"],[["modules/clean/init_react", "modules/clean/react/locale_selector"], (function(InitReact,mod){
//InitReact.mountComponent(mod, {"module_name": "modules/clean/react/locale_selector", "component_name": "LocaleSelector", "elem_id": "component3890191328821095616", "props": {}});
//}), "require-tier-init_react_modules/clean/react/locale_selector-LocaleSelector"],[["modules/clean/legacy_ui_button"], (function(initUIButtons){
//
//           initUIButtons.default();
//           ;
//}), ""],[["modules/clean/privacy_consent"], (function(PrivacyConsentPlatform){
//PrivacyConsentPlatform.initialize_module({iframeOrigin: "consent.dropbox.com", countryCode: "UA", isCcpaEnabled: true,});;
//}), ""],[["modules/clean/privacy_consent"], (function(PrivacyConsentPlatform){
//PrivacyConsentPlatform.initialize_module({iframeOrigin: "consent.dropbox.com", countryCode: "UA", isCcpaEnabled: true,});;
//}), ""],[["modules/clean/privacy_consent"], (function(PrivacyConsentPlatform){
//PrivacyConsentPlatform.initialize_module({iframeOrigin: "consent.dropbox.com", countryCode: "UA", isCcpaEnabled: true,});;
//}), ""],[["modules/clean/web_timing_logger"], (function(mod){
//mod.initialize_module({"is_pagelet": false, "is_dws": false, "is_dws2": false, "is_early_ensemble": false, "source_type": "web", "subtypes": {"js_preloading": null, "metro": "sjc", "amp_tti_flow": ""}, "url": null, "log_time_to_view": null, "log_time_to_interactive": null, "ttv_at_dom_interactive": null, "tti_at_dom_interactive": null});
//}), "require-tier-require-and-configure-modules/clean/web_timing_logger"],[["modules/core/toast/toast_on_init"], (function(ToastOnInit){
//ToastOnInit.showToastFromCookie();;
//}), ""],[["react"], (function(React){
///* dbx-global-decl: React is for devtools */
//window.React = React;;
//}), "require-tier-react-element-set-global"]]]);
//            </script>
//    <img alt="" src="https://dropbox.com/hstsping" style="display:none;"/>
//    <div class="ax-visually-hidden" id="accessible-announce" aria-live="assertive"/>
//  </body>
//</html>
//
//===============================================
//Default Suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================
//
//
//Process finished with exit code 0
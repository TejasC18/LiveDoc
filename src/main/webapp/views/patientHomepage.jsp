<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US" dir="ltr">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />

    <!-- ===============================================-->
    <!--    Document Title-->
    <!-- ===============================================-->
    <title>Livedoc</title>

    <!-- ===============================================-->
    <!--    Favicons-->
    <!-- ===============================================-->
    <link
      rel="apple-touch-icon"
      sizes="180x180"
      href="/img/favicons/apple-touch-icon.png"
    />
    <link
      rel="icon"
      type="image/png"
      sizes="32x32"
      href="/img/favicons/favicon-32x32.png"
    />
    <link
      rel="icon"
      type="image/png"
      sizes="16x16"
      href="/img/favicons/favicon-16x16.png"
    />
    <link
      rel="shortcut icon"
      type="image/x-icon"
      href="/img/favicons/favicon.ico"
    />
    <link rel="manifest" href="/img/favicons/manifest.json" />
    <meta
      name="msapplication-TileImage"
      content="/img/favicons/mstile-150x150.png"
    />
    <meta name="theme-color" content="#ffffff" />

    <!-- ===============================================-->
    <!--    Stylesheets-->
    <!-- ===============================================-->
    <link href="/css/index.css" rel="stylesheet" />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Fjalla+One&amp;family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100&amp;display=swap"
      rel="stylesheet"
    />
  </head>

  <body>
    <!-- ===============================================-->
    <!--    Main Content-->
    <!-- ===============================================-->
    <main class="main" id="top">
      <nav
        class="navbar navbar-expand-lg navbar-light fixed-top py-3 d-block"
        data-navbar-on-scroll="data-navbar-on-scroll"
      >
        <div class="container">
          <a class="navbar-brand" href="index.html"
            ><img src="../img/gallery/logo.png" width="118" alt="logo"
          /></a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"> </span>
          </button>
          <div
            class="collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0"
            id="navbarSupportedContent"
          >
            <ul class="navbar-nav ms-auto pt-2 pt-lg-0 font-base">
              <li class="nav-item px-2">
                <a class="nav-link" aria-current="page" href="#about"
                  >About Us</a
                >
              </li>
              <li class="nav-item px-2">
                <a class="nav-link" href="#departments">Departments</a>
              </li>
              <% int userId = (int)request.getAttribute("userId"); %>
              <li class="nav-item px-2">
                <a class="nav-link" href="/patients/showAllDoctors/<%=userId%>">Find Doctors</a>
              </li>
              <li class="nav-item px-2">
                <a class="nav-link" href="/patients/showAllReports/<%=userId%>">Reports</a>
              </li>
              <li class="nav-item px-2">
                <a class="nav-link" href="/patients/profile/<%=userId%>">Profile</a>
              </li>
            </ul>
            <a
              class="btn btn-sm btn-outline-primary rounded-pill order-1 order-lg-0 ms-lg-4"
              href="/"
              >Log Out</a
            >
          </div>
        </div>
      </nav>
      <section class="py-xxl-10 pb-0" id="home">
        <div
          class="bg-holder bg-size"
          style="
            background-image: url(/img/gallery/hero-bg.png);
            background-position: top center;
            background-size: cover;
          "
        ></div>
        <!--/.bg-holder-->

        <div class="container">
          <div class="row min-vh-xl-100 min-vh-xxl-25">
            <div
              class="col-md-5 col-xl-6 col-xxl-7 order-0 order-md-1 text-end"
            >
              <img
                class="pt-7 pt-md-0 w-100"
                src="../img/gallery/hero.png"
                alt="hero-header"
              />
            </div>
            <div
              class="col-md-75 col-xl-6 col-xxl-5 text-md-start text-center py-6"
            >
              <h1 class="fw-light font-base fs-6 fs-xxl-7">
                We're <strong>determined </strong>for<br />your&nbsp;<strong
                  >better life.</strong
                >
              </h1>
              <p class="fs-1 mb-5">
                You can get the care you need 24/7 – be it online or in
                <br />person. You will be treated by caring specialist doctors.
              </p>
              <a
                class="btn btn-lg btn-primary rounded-pill"
                href="/patients/appointment/<%=userId%>"
                >Make an Appointment</a
              >
            </div>
          </div>
        </div>
      </section>

      <!-- ============================================-->
      <!-- <section> begin ============================-->
      <section class="py-5" id="departments">
        <div class="container">
          <div class="row">
            <div class="col-12 py-3">
              <div
                class="bg-holder bg-size"
                style="
                  background-image: url(/img/gallery/bg-departments.png);
                  background-position: top center;
                  background-size: contain;
                "
              ></div>
              <!--/.bg-holder-->

              <h1 class="text-center">OUR DEPARTMENTS</h1>
            </div>
          </div>
        </div>
        <!-- end of .container-->
      </section>
      <!-- <section> close ============================-->
      <!-- ============================================-->

      <!-- ============================================-->
      <!-- <section> begin ============================-->
      <section class="py-0">
        <div class="container">
          <div
            class="row py-5 align-items-center justify-content-center justify-content-lg-evenly"
          >
            <div class="col-auto col-md-4 col-lg-auto text-xl-start">
              <div class="d-flex flex-column align-items-center">
                <div class="icon-box text-center">
                  <a class="text-decoration-none" href="#!"
                    ><img
                      class="mb-3 deparment-icon"
                      src="/img/icons/neurology.png"
                      alt="..."
                    /><img
                      class="mb-3 deparment-icon-hover"
                      src="/img/icons/neurology.svg"
                      alt="..."
                    />
                    <p class="fs-1 fs-xxl-2 text-center">Neurology</p>
                  </a>
                </div>
              </div>
            </div>
            <div class="col-auto col-md-4 col-lg-auto text-xl-start">
              <div class="d-flex flex-column align-items-center">
                <div class="icon-box text-center">
                  <a class="text-decoration-none" href="#!"
                    ><img
                      class="mb-3 deparment-icon"
                      src="/img/icons/eye-care.png"
                      alt="..."
                    /><img
                      class="mb-3 deparment-icon-hover"
                      src="/img/icons/eye-care.svg"
                      alt="..."
                    />
                    <p class="fs-1 fs-xxl-2 text-center">Eye care</p>
                  </a>
                </div>
              </div>
            </div>
            <div class="col-auto col-md-4 col-lg-auto text-xl-start">
              <div class="d-flex flex-column align-items-center">
                <div class="icon-box text-center">
                  <a class="text-decoration-none" href="#!"
                    ><img
                      class="mb-3 deparment-icon"
                      src="/img/icons/cardiac.png"
                      alt="..."
                    /><img
                      class="mb-3 deparment-icon-hover"
                      src="/img/icons/cardiac.svg"
                      alt="..."
                    />
                    <p class="fs-1 fs-xxl-2 text-center">Cardiac care</p>
                  </a>
                </div>
              </div>
            </div>
            <div class="col-auto col-md-4 col-lg-auto text-xl-start">
              <div class="d-flex flex-column align-items-center">
                <div class="icon-box text-center">
                  <a class="text-decoration-none" href="#!"
                    ><img
                      class="mb-3 deparment-icon"
                      src="/img/icons/heart.png"
                      alt="..."
                    /><img
                      class="mb-3 deparment-icon-hover"
                      src="/img/icons/heart.svg"
                      alt="..."
                    />
                    <p class="fs-1 fs-xxl-2 text-center">Heart care</p>
                  </a>
                </div>
              </div>
            </div>
            <div class="col-auto col-md-4 col-lg-auto text-xl-start">
              <div class="d-flex flex-column align-items-center">
                <div class="icon-box text-center">
                  <a class="text-decoration-none" href="#!"
                    ><img
                      class="mb-3 deparment-icon"
                      src="/img/icons/osteoporosis.png"
                      alt="..."
                    /><img
                      class="mb-3 deparment-icon-hover"
                      src="/img/icons/osteoporosis.svg"
                      alt="..."
                    />
                    <p class="fs-1 fs-xxl-2 text-center">Osteoporosis</p>
                  </a>
                </div>
              </div>
            </div>
            <div class="col-auto col-md-4 col-lg-auto text-xl-start">
              <div class="d-flex flex-column align-items-center">
                <div class="icon-box text-center">
                  <a class="text-decoration-none" href="#!"
                    ><img
                      class="mb-3 deparment-icon"
                      src="/img/icons/ent.png"
                      alt="..."
                    /><img
                      class="mb-3 deparment-icon-hover"
                      src="/img/icons/ent.svg"
                      alt="..."
                    />
                    <p class="fs-1 fs-xxl-2 text-center">ENT</p>
                  </a>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- end of .container-->
      </section>
      <!-- <section> close ============================-->
      <!-- ============================================-->

      <section class="bg-secondary">
        <div
          class="bg-holder"
          style="
            background-image: url(/img/gallery/bg-eye-care.png);
            background-position: center;
            background-size: contain;
          "
        ></div>
        <!--/.bg-holder-->

        <div class="container">
          <div class="row align-items-center">
            <div class="col-md-5 col-xxl-6">
              <img
                class="img-fluid"
                src="/img/gallery/eye-care.png"
                alt="..."
              />
            </div>
            <div class="col-md-7 col-xxl-6 text-center text-md-start">
              <h2 class="fw-bold text-light mb-4 mt-4 mt-lg-0">
                Eye Care with Top Professionals<br
                  class="d-none d-sm-block"
                />and In Budget.
              </h2>
              <p class="text-light">
                We've built a healthcare system that puts your needs first.<br
                  class="d-none d-sm-block"
                />For us, there is nothing more important than the health of
                <br class="d-none d-sm-block" />you and your loved ones.
              </p>
              <div class="py-3">
                <a
                  class="btn btn-lg btn-light rounded-pill"
                  href="#!"
                  role="button"
                  >Learn more
                </a>
              </div>
            </div>
          </div>
        </div>
      </section>

      <!-- ============================================-->
      <!-- <section> begin ============================-->
      <section class="pb-0" id="about">
        <div class="container">
          <div class="row">
            <div class="col-12 py-3">
              <div
                class="bg-holder bg-size"
                style="
                  background-image: url(../img/gallery/about-us.png);
                  background-position: top center;
                  background-size: contain;
                "
              ></div>
              <!--/.bg-holder-->

              <h1 class="text-center">ABOUT US</h1>
            </div>
          </div>
        </div>
        <!-- end of .container-->
      </section>
      <!-- <section> close ============================-->
      <!-- ============================================-->

      <section class="py-5">
        <div
          class="bg-holder bg-size"
          style="
            background-image: url(../img/gallery/about-bg.png);
            background-position: top center;
            background-size: contain;
          "
        ></div>
        <!--/.bg-holder-->

        <div class="container">
          <div class="row align-items-center">
            <div class="col-md-6 order-lg-1 mb-5 mb-lg-0">
              <img
                class="fit-cover rounded-circle w-100"
                src="../img/gallery/health-care.png"
                alt="..."
              />
            </div>
            <div class="col-md-6 text-center text-md-start">
              <h2 class="fw-bold mb-4">
                We are developing a healthcare
                <br class="d-none d-sm-block" />system around you
              </h2>
              <p>
                We think that everyone should have easy access to excellent
                <br class="d-none d-sm-block" />healthcare. Our aim is to make
                the procedure as simple as
                <br class="d-none d-sm-block" />possible for our patients and to
                offer treatment no matter<br class="d-none d-sm-block" />where
                they are — in person or at their convenience.
              </p>
              <div class="py-3">
                <button
                  class="btn btn-lg btn-outline-primary rounded-pill"
                  type="submit"
                >
                  Learn more
                </button>
              </div>
            </div>
          </div>
        </div>
      </section>

      <section class="py-0 bg-secondary">
        <div
          class="bg-holder opacity-25"
          style="
            background-image: url(../img/gallery/dot-bg.png);
            background-position: top left;
            margin-top: -3.125rem;
            background-size: auto;
          "
        ></div>
        <!--/.bg-holder-->

        <!-- ============================================-->
        <!-- <section> begin ============================-->
        <section class="py-0 bg-primary">
          <div class="container">
            <div
              class="row justify-content-md-between justify-content-evenly py-4"
            >
              <div
                class="col-12 col-sm-8 col-md-6 col-lg-auto text-center text-md-start"
              >
                <p class="fs--1 my-2 fw-bold text-200">
                  All rights Reserved &copy; Your Company, 2021
                </p>
              </div>
              <div class="col-12 col-sm-8 col-md-6">
                <p class="fs--1 my-2 text-center text-md-end text-200">
                  Made with&nbsp;
                  <svg
                    class="bi bi-suit-heart-fill"
                    xmlns="http://www.w3.org/2000/svg"
                    width="12"
                    height="12"
                    fill="#F95C19"
                    viewBox="0 0 16 16"
                  >
                    <path
                      d="M4 1c2.21 0 4 1.755 4 3.92C8 2.755 9.79 1 12 1s4 1.755 4 3.92c0 3.263-3.234 4.414-7.608 9.608a.513.513 0 0 1-.784 0C3.234 9.334 0 8.183 0 4.92 0 2.755 1.79 1 4 1z"
                    ></path></svg
                  >&nbsp;by&nbsp;<a
                    class="fw-bold text-info"
                    href="https://themewagon.com/"
                    target="_blank"
                    >ThemeWagon
                  </a>
                </p>
              </div>
            </div>
          </div>
          <!-- end of .container-->
        </section>
        <!-- <section> close ============================-->
        <!-- ============================================-->
      </section>
    </main>
    <!-- ===============================================-->
    <!--    End of Main Content-->
    <!-- ===============================================-->

    <!-- ===============================================-->
    <!--    JavaScripts-->
    <!-- ===============================================-->
    <script src="https://scripts.sirv.com/sirvjs/v3/sirv.js"></script>
    <script src="https://polyfill.io/v3/polyfill.min.js?features=window.scroll"></script>
  </body>
</html>
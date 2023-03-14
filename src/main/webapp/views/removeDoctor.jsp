<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Login 10</title>
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <link rel="stylesheet" href="/css/style.css" />
    <script nonce="b0648c76-2022-4472-aecc-bc8fa19932e3">
      (function (w, d) {
        !(function (bv, bw, bx, by) {
          bv[bx] = bv[bx] || {};
          bv[bx].executed = [];
          bv.zaraz = { deferred: [], listeners: [] };
          bv.zaraz.q = [];
          bv.zaraz._f = function (bz) {
            return function () {
              var bA = Array.prototype.slice.call(arguments);
              bv.zaraz.q.push({ m: bz, a: bA });
            };
          };
          for (const bB of ["track", "set", "debug"])
            bv.zaraz[bB] = bv.zaraz._f(bB);
          bv.zaraz.init = () => {
            var bC = bw.getElementsByTagName(by)[0],
              bD = bw.createElement(by),
              bE = bw.getElementsByTagName("title")[0];
            bE && (bv[bx].t = bw.getElementsByTagName("title")[0].text);
            bv[bx].x = Math.random();
            bv[bx].w = bv.screen.width;
            bv[bx].h = bv.screen.height;
            bv[bx].j = bv.innerHeight;
            bv[bx].e = bv.innerWidth;
            bv[bx].l = bv.location.href;
            bv[bx].r = bw.referrer;
            bv[bx].k = bv.screen.colorDepth;
            bv[bx].n = bw.characterSet;
            bv[bx].o = new Date().getTimezoneOffset();
            if (bv.dataLayer)
              for (const bI of Object.entries(
                Object.entries(dataLayer).reduce((bJ, bK) => ({
                  ...bJ[1],
                  ...bK[1],
                }))
              ))
                zaraz.set(bI[0], bI[1], { scope: "page" });
            bv[bx].q = [];
            for (; bv.zaraz.q.length; ) {
              const bL = bv.zaraz.q.shift();
              bv[bx].q.push(bL);
            }
            bD.defer = !0;
            for (const bM of [localStorage, sessionStorage])
              Object.keys(bM || {})
                .filter((bO) => bO.startsWith("_zaraz_"))
                .forEach((bN) => {
                  try {
                    bv[bx]["z_" + bN.slice(7)] = JSON.parse(bM.getItem(bN));
                  } catch {
                    bv[bx]["z_" + bN.slice(7)] = bM.getItem(bN);
                  }
                });
            bD.referrerPolicy = "origin";
            bD.src =
              "/cdn-cgi/zaraz/s.js?z=" +
              btoa(encodeURIComponent(JSON.stringify(bv[bx])));
            bC.parentNode.insertBefore(bD, bC);
          };
          ["complete", "interactive"].includes(bw.readyState)
            ? zaraz.init()
            : bv.addEventListener("DOMContentLoaded", zaraz.init);
        })(w, d, "zarazData", "script");
      })(window, document);
    </script>
  </head>
  <body class="img js-fullheight" style="background-image: url(/img/bg.jpg);
      background-color: rgb(61, 94, 137);" >
      <% int userId = (int)request.getAttribute("userId"); %>
    <section class="ftco-section">
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-md-6 col-lg-4">
            <div class="login-wrap p-0">
              <form action="/admin/removeDoctor/<%= userId%>" class="signin-form" method="post">
                <div class="form-group">
                  <input
                    type="text"
                    class="form-control"
                    name="doctorID"
                    placeholder="Doctor ID"
                    required
                  />
                </div>
                <div class="form-group">
                  <button
                    type="submit"
                    class="form-control btn btn-primary submit px-3"
                  >
                    Remove
                  </button>
                </div>
                <div class="form-group d-md-flex">
                  
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </section>
    <script src="/js/jquery.min.js"></script>
    <script src="/js/popper.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/main.js"></script>
    <script
      defer
      src="https://static.cloudflareinsights.com/beacon.min.js/vaafb692b2aea4879b33c060e79fe94621666317369993"
      integrity="sha512-0ahDYl866UMhKuYcW078ScMalXqtFJggm7TmlUtp0UlD4eQk0Ixfnm5ykXKvGJNFjLMoortdseTfsRT8oCfgGA=="
      data-cf-beacon='{"rayId":"7a43dc492e22f395","token":"cd0b4b3a733644fc843ef0b185f98241","version":"2023.2.0","si":100}'
      crossorigin="anonymous"
    ></script>
  </body>
</html>

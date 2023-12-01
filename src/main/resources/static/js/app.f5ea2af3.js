(function(){"use strict";var a={5664:function(a,t,n){var e=n(9242),s=n(3396);const i={id:"app"};function o(a,t,n,e,o,r){const c=(0,s.up)("router-view");return(0,s.wg)(),(0,s.iD)("div",i,[(0,s.Wm)(c)])}var r={name:"App",components:{}},c=n(89);const l=(0,c.Z)(r,[["render",o]]);var d=l,u=n(678);const p=a=>((0,s.dD)("data-v-3b559b76"),a=a(),(0,s.Cn)(),a),v={class:"container",id:"container",ref:"container"},f=(0,s.uE)('<div class="form-container sign-up-container" data-v-3b559b76><form action="#" data-v-3b559b76><h1 data-v-3b559b76>Create Account</h1><div class="social-container" data-v-3b559b76><a href="#" class="social" data-v-3b559b76><i class="fab fa-facebook-f" data-v-3b559b76></i></a><a href="#" class="social" data-v-3b559b76><i class="fab fa-google-plus-g" data-v-3b559b76></i></a><a href="#" class="social" data-v-3b559b76><i class="fab fa-linkedin-in" data-v-3b559b76></i></a></div><span data-v-3b559b76>or use your email for registration</span><input type="text" placeholder="Name" data-v-3b559b76><input type="email" placeholder="Email" data-v-3b559b76><input type="password" placeholder="Password" data-v-3b559b76><button data-v-3b559b76>Sign Up</button></form></div><div class="form-container sign-in-container" data-v-3b559b76><form action="#" data-v-3b559b76><h1 data-v-3b559b76>Sign in</h1><div class="social-container" data-v-3b559b76><a href="#" class="social" data-v-3b559b76><i class="fab fa-facebook-f" data-v-3b559b76></i></a><a href="#" class="social" data-v-3b559b76><i class="fab fa-google-plus-g" data-v-3b559b76></i></a><a href="#" class="social" data-v-3b559b76><i class="fab fa-linkedin-in" data-v-3b559b76></i></a></div><span data-v-3b559b76>or use your account</span><input type="email" placeholder="Email" data-v-3b559b76><input type="password" placeholder="Password" data-v-3b559b76><a href="#" data-v-3b559b76>Forgot your password?</a><button data-v-3b559b76>Sign In</button></form></div>',2),b={class:"overlay-container"},h={class:"overlay"},m={class:"overlay-panel overlay-left"},g=p((()=>(0,s._)("h1",null,"Welcome Back!",-1))),_=p((()=>(0,s._)("p",null,"To keep connected with us please login with your personal info",-1))),w={class:"overlay-panel overlay-right"},y=p((()=>(0,s._)("h1",null,"Hello, Friend!",-1))),k=p((()=>(0,s._)("p",null,"Enter your personal details and start journey with us",-1))),C=p((()=>(0,s._)("footer",null,[(0,s._)("p",null,[(0,s.Uk)(" Created with "),(0,s._)("i",{class:"fa fa-heart"}),(0,s.Uk)(" by "),(0,s._)("a",{target:"_blank",href:"https://florin-pop.com"},"Florin Pop"),(0,s.Uk)(" - Read how I created this and how you can join the challenge "),(0,s._)("a",{target:"_blank",href:"https://www.florin-pop.com/blog/2019/03/double-slider-sign-in-up-form/"},"here"),(0,s.Uk)(". ")])],-1)));function I(a,t,n,e,i,o){return(0,s.wg)(),(0,s.iD)("div",v,[f,(0,s._)("div",b,[(0,s._)("div",h,[(0,s._)("div",m,[g,_,(0,s._)("button",{class:"ghost",onClick:t[0]||(t[0]=(...a)=>o.handleSignIn&&o.handleSignIn(...a))},"Sign In")]),(0,s._)("div",w,[y,k,(0,s._)("button",{class:"ghost",onClick:t[1]||(t[1]=(...a)=>o.handleSignUp&&o.handleSignUp(...a))},"Sign Up")])])]),C],512)}n(560);var $=n(1076),O={name:"LoginForm",methods:{handleSignUp(){this.$refs.container.classList.add("right-panel-active")},handleSignIn(){this.$refs.container.classList.remove("right-panel-active")},login(){const a=this.username,t=this.password;$.Z.post("http://localhost:80/api/login",{username:a,password:t}).then((a=>{a.data.success?this.$router.push({name:"main"}):alert("Login failed")})).catch((a=>{console.error(a)}))}}};const S=(0,c.Z)(O,[["render",I],["__scopeId","data-v-3b559b76"]]);var T=S,j=n(7139);const D={class:"wrapper"},x={class:"screen -left"},P=(0,s._)("div",{class:"app-bar"},[(0,s._)("img",{class:"logo",src:"https://s3-us-west-2.amazonaws.com/s.cdpn.io/1315882/pngwave.png"})],-1),z=(0,s._)("div",{class:"title"},"Picked items",-1),U={class:"shop-items"},Z={class:"item"},L={class:"item-block"},W=["src"],E={class:"name"},F={class:"description"},M={class:"bottom-area"},A={class:"price"},B=["onClick"],H={key:0},Y={key:1,class:"cover"},K=(0,s._)("div",{class:"check"},null,-1),R=[K],q={class:"screen -right",ref:"cartItems"},N=(0,s._)("div",{class:"app-bar"},[(0,s._)("img",{class:"logo",src:"https://s3-us-west-2.amazonaws.com/s.cdpn.io/1315882/pngwave.png"})],-1),G=(0,s._)("div",{class:"title"},"Your cart",-1),J={key:0,class:"no-content"},Q=(0,s._)("p",{class:"text"},"Your cart is empty.",-1),V=[Q],X={class:"cart-items"},aa={class:"left"},ta={class:"cart-image"},na={class:"image-wrapper"},ea=["src"],sa={class:"right"},ia={class:"name"},oa={class:"price"},ra={class:"count"},ca=["onClick"],la={class:"number"},da=["onClick"];function ua(a,t,n,i,o,r){return(0,s.wg)(),(0,s.iD)("div",D,[(0,s._)("div",x,[P,z,(0,s._)("div",U,[((0,s.wg)(!0),(0,s.iD)(s.HY,null,(0,s.Ko)(o.shopItems,(a=>((0,s.wg)(),(0,s.iD)("div",Z,[(0,s._)("div",L,[(0,s._)("div",{class:"image-area",style:(0,j.j5)({backgroundColor:a.color})},[(0,s._)("img",{class:"image",src:a.image},null,8,W)],4),(0,s._)("div",E,(0,j.zw)(a.name),1),(0,s._)("div",F,(0,j.zw)(a.description),1),(0,s._)("div",M,[(0,s._)("div",A,"$"+(0,j.zw)(a.price),1),(0,s._)("div",{class:(0,j.C_)(["button",{"-active":a.inCart}]),onClick:t=>r.addToCart(a),ref_for:!0,ref:"addButton"+a.id},[(0,s.Wm)(e.uT,{name:"buttonText",mode:"out-in"},{default:(0,s.w5)((()=>[a.inCart?((0,s.wg)(),(0,s.iD)("div",Y,R)):((0,s.wg)(),(0,s.iD)("p",H,"ADD TO CART"))])),_:2},1024)],10,B)])])])))),256))])]),(0,s._)("div",q,[N,G,(0,s.Wm)(e.uT,{name:"noContent"},{default:(0,s.w5)((()=>[0===a.$data.cartItems.length?((0,s.wg)(),(0,s.iD)("div",J,V)):(0,s.kq)("",!0)])),_:1}),(0,s._)("div",X,[(0,s.Wm)(e.W3,{name:"cartList",tag:"div"},{default:(0,s.w5)((()=>[((0,s.wg)(!0),(0,s.iD)(s.HY,null,(0,s.Ko)(a.$data.cartItems,(a=>((0,s.wg)(),(0,s.iD)("div",{class:"cart-item",key:a.id},[(0,s._)("div",aa,[(0,s._)("div",ta,[(0,s._)("div",na,[(0,s._)("img",{class:"image",src:a.image},null,8,ea)])])]),(0,s._)("div",sa,[(0,s._)("div",ia,(0,j.zw)(a.name),1),(0,s._)("div",oa,"$"+(0,j.zw)(a.price),1),(0,s._)("div",ra,[(0,s._)("div",{class:"button",onClick:t=>r.decrement(a)},"<",8,ca),(0,s._)("div",la,(0,j.zw)(a.count),1),(0,s._)("div",{class:"button",onClick:t=>r.increment(a)},">",8,da)])])])))),128))])),_:1})])],512)])}var pa=n(8552),va={name:"MainComponent",data(){return{shopItems:[],cartItems:[]}},mounted:function(){$.Z.get("https://s3-us-west-2.amazonaws.com/s.cdpn.io/1315882/shoes.json").then((a=>{this.$data.shopItems=a.data.shoes}))},methods:{addToCart(a){if(!a.inCart){a.inCart=!0;const t=Object.assign({},a,{count:1});this.$data.cartItems.push(t);const n=this.$refs[`addButton${a.id}`];pa.ZP.to(n,{width:46,duration:.8,ease:"power4"})}this.$nextTick((()=>{this.$refs.cartItems.scrollTop=this.$refs.cartItems.scrollHeight}))},decrement(a){a.count--;const t=this.$data.shopItems.find((t=>t.id===a.id));this.$nextTick((function(){if(0===a.count){const n=this.$refs[`addButton${t.id}`];pa.ZP.to(n,{width:136,duration:.8,ease:"power4"}),t.inCart=!1;const e=this.$data.cartItems.findIndex((t=>t.id===a.id));this.$data.cartItems.splice(e,1)}}))},increment(a){a.count++}}};const fa=(0,c.Z)(va,[["render",ua]]);var ba=fa;const ha=[{path:"/",name:"Main",component:ba},{path:"/login",name:"Login",component:T}],ma=(0,u.p7)({history:(0,u.PO)(),routes:ha});var ga=ma;const _a=(0,e.ri)(d);_a.use(ga),_a.mount("#app")}},t={};function n(e){var s=t[e];if(void 0!==s)return s.exports;var i=t[e]={exports:{}};return a[e].call(i.exports,i,i.exports,n),i.exports}n.m=a,function(){var a=[];n.O=function(t,e,s,i){if(!e){var o=1/0;for(d=0;d<a.length;d++){e=a[d][0],s=a[d][1],i=a[d][2];for(var r=!0,c=0;c<e.length;c++)(!1&i||o>=i)&&Object.keys(n.O).every((function(a){return n.O[a](e[c])}))?e.splice(c--,1):(r=!1,i<o&&(o=i));if(r){a.splice(d--,1);var l=s();void 0!==l&&(t=l)}}return t}i=i||0;for(var d=a.length;d>0&&a[d-1][2]>i;d--)a[d]=a[d-1];a[d]=[e,s,i]}}(),function(){n.n=function(a){var t=a&&a.__esModule?function(){return a["default"]}:function(){return a};return n.d(t,{a:t}),t}}(),function(){n.d=function(a,t){for(var e in t)n.o(t,e)&&!n.o(a,e)&&Object.defineProperty(a,e,{enumerable:!0,get:t[e]})}}(),function(){n.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(a){if("object"===typeof window)return window}}()}(),function(){n.o=function(a,t){return Object.prototype.hasOwnProperty.call(a,t)}}(),function(){n.r=function(a){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(a,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(a,"__esModule",{value:!0})}}(),function(){var a={143:0};n.O.j=function(t){return 0===a[t]};var t=function(t,e){var s,i,o=e[0],r=e[1],c=e[2],l=0;if(o.some((function(t){return 0!==a[t]}))){for(s in r)n.o(r,s)&&(n.m[s]=r[s]);if(c)var d=c(n)}for(t&&t(e);l<o.length;l++)i=o[l],n.o(a,i)&&a[i]&&a[i][0](),a[i]=0;return n.O(d)},e=self["webpackChunkfrontend"]=self["webpackChunkfrontend"]||[];e.forEach(t.bind(null,0)),e.push=t.bind(null,e.push.bind(e))}();var e=n.O(void 0,[998],(function(){return n(5664)}));e=n.O(e)})();
//# sourceMappingURL=app.f5ea2af3.js.map
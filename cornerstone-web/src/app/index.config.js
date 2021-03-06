(function() {
    'use strict';

    angular
        .module('viModule')
        .config(config);

    /** @ngInject */
    function config($logProvider, toastrConfig, $httpProvider,stConfig) {
        // Enable log
        $logProvider.debugEnabled(false);

        // Set options third-party lib
        toastrConfig.allowHtml = true;
        toastrConfig.timeOut = 3000;
        toastrConfig.positionClass = 'toast-top-right';
        toastrConfig.preventOpenDuplicates = true;
        toastrConfig.progressBar = false;
        $httpProvider.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded;charset=UTF-8";
	stConfig.pagination.template = 'template/pagination.custom.html';

    }

})();

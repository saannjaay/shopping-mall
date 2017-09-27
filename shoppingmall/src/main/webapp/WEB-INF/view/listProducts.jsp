<div class="container">

	<div class="row">

		<!--  would be to display sidebar-->
		<div class="col-md-3">

			<%@ include file="./shared/sidebar.jsp"%>

		</div>


		<!-- to display actual product  -->

	</div>
	<div class="col-md-9">
		<!-- adding breadcrumb component -->
		<div class="row">
			<div class="col-lg-12">

				<c:if test="${userClickAllproducts==true }">

					<ol class="breadcrumb">


						<li><a href="${contextRoot}/home ">Home</a></li>
						<li class="active">All Products</li>



					</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts==true }">

						<ol class="breadcrumb">


							<li class="active"><a href="${contextRoot}/home ">Home</a></li>
							<li class="active">Category/</li>
							<li class="active">${category.name }</li>


						</ol>
					</c:if>
			</div>


		</div>




	</div>